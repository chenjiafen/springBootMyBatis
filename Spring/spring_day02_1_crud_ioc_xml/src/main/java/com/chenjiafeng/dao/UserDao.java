package com.chenjiafeng.dao;

import com.chenjiafeng.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-12-05 00:11
 */
public interface UserDao{
    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User findByid(Integer id);

    /**
     * 保存用户
     * @param user
     */
    public void save(User user);

    /**
     * 更新用户信息
     * @param user
     */
    public void updatae(User user);

    /**
     * 根据id删除账户
     * @param id
     */
    public void del(Integer id);
}
