package com.chenjiafeng.dao;

import com.chenjiafeng.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-28 16:15
 */


public interface UserDao {

    /**
     * 查询当前用户
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 条件查询
     * username 模糊查询
     * 和password查询
     * @param user
     * @return
     */
    public List<User> findByCondtion(User user);

    public List<User> findById(Integer id);
}
