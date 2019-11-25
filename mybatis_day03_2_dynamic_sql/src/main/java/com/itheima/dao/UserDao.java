package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/24 23:39
 */
public interface UserDao {
    /**
     * 条件查询
     * 根据Username模糊查询
     * 根据name查询
     * @param user
     * @return
     */
    public List<User> findByCondition(User user);
}
