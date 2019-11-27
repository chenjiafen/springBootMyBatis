package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/28 0:19
 */
public interface UserDao {
    /**
     * 根据用户id查询用户对象
     * @param id
     * @return
     */
    public User findById(Integer id);
}
