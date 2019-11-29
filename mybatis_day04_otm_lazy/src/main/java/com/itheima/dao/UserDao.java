package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/28 0:19
 */
public interface UserDao {
    /**
     *
     * 一个账户对应一个用户对象
     * 查询所有的用户，包含账户信息
     * @return
     */
    public List<User> findAll();
}
