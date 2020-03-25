package com.tensquare.base.service;


import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LabelService
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/24
 * @Version V1.0
 **/
@Service
@Transactional
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    //增
    public void add(Label label) {
        label.setId(idWorker.nextId() + ""); //设置id
        labelDao.save(label);
    }


    // 删
    public void delete(String id) {
        labelDao.deleteById(id);
    }

    // 改
    public void update(String id, Label label) {
        label.setId(id);
        labelDao.save(label);
    }

    // 查 查询全部
    public List<Label> findAll() {
        return labelDao.findAll();
    }

    //查询 根据id查询
    public Label findById(String id) {
        return labelDao.findById(id).get();
    }

    //查询 条件查询
    public List<Label> findByCondition(Label label) {
        return labelDao.findAll(generteSpec(label));
    }

    //查 分页条件查询
    public PageResult<Label> findPageByCondition(Integer page, Integer size, Label label) {
//        new PageRequest(page,size);已过时
        Page<Label> pageBen = labelDao.findAll(generteSpec(label), PageRequest.of(page - 1, size));//页码是从0开始计算，表单传过来的是1开始

        //pageben.getTotalElements()总记录数
        //pageben.getContent() 列表数据
        return new PageResult<>(pageBen.getTotalElements(), pageBen.getContent());
    }

    private Specification<Label> generteSpec(Label label) {
        return new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> plist = new ArrayList<>(); //保存后续拼装的条件

                //labelname 条件(标签名)
                if (!StringUtils.isEmpty(label.getLabelname())) {
                    //拼装条件
                    Predicate p = criteriaBuilder.like(root.get("labelname").as(String.class), label.getLabelname());
                    //将条件存入集合中
                    plist.add(p);
                }
                //state 条件(equal精准查询)
                if (!StringUtils.isEmpty(label.getState())) {
                    Predicate p = criteriaBuilder.equal(root.get("state").as(String.class), label.getState());
                    plist.add(p);
                }
                //recommend条件（推荐）
                if (!StringUtils.isEmpty(label.getRecommend())) {
                    Predicate p = criteriaBuilder.equal(root.get("recommend").as(String.class), label.getRecommend());
                    plist.add(p);
                }


                if (plist.isEmpty()) {
                    //三个条件都没有
                    return null;
                } else
                    //如果有条件
                    return criteriaBuilder.and(plist.toArray(new Predicate[plist.size()]));


            }
        };
    }
}
