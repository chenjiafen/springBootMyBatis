package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/19 23:30
 */
public interface UserDao {

    /**
     * 查询全部
     * @return
     */
    public List<User> findAll();

    /**
     * 插入用户数据
     * @param user
     */
    public void save(User user);


    /**
     * 更细数据
     * @param user
     */
    public  void update(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    public void delete(Integer id);
}
