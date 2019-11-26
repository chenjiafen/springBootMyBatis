package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/24 23:39
 */
public interface UserDao {
    /**
     * 返回所有的user对象，包含用户对应的账户信息
     * @return
     */
    public List<User> findAll();
}
