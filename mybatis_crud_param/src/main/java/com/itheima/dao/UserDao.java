package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import com.sun.imageio.plugins.common.I18NImpl;

import java.util.List;
import java.util.Map;

/**
 * @author tyler.chen
 * @date 2019/11/20 21:53
 */
public interface UserDao {
    /**
     * 根据多条件查询的
     * @param username
     * @param startIndex
     * @param pageSize
     * @return
     */
    public List<User> findByManyParam(String username,Integer startIndex,Integer pageSize);

    /**
     * 多条件查询
     * @param queryVo
     * @return
     */
    //    public List<User> findByCondition(User user, Integer starIndex, Integer pageSize);
    public List<User> findByCondition(QueryVo queryVo);

    /**
     * 多条件查询
     * @param map
     * @return
     */
    public  List<User> findByMap(Map<String,Object> map);

    /**
     * 查询全部
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 插入用户数据
     *
     * @param user
     */
    public void save(User user);


    /**
     * 更细数据
     *
     * @param user
     */
    public void update(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     */
    public void delete(Integer id);
}
