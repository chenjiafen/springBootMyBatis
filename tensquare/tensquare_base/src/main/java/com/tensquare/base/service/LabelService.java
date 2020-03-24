package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.transaction.Transactional;
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

    public void update(Label label){
        labelDao.save(label);
    }
    // 查 查询全部
    public List<Label> findAll(){
        return labelDao.findAll();
    }
    //查询 根据id查询
    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    //查询 条件查询
}
