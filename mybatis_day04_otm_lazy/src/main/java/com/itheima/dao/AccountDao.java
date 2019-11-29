package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/27 23:27
 */
public interface AccountDao {

    public List<Account> findAll();


    /**
     * 根据用户名查询对应的账户信息
     * @param userId
     * @return
     */
    public List<Account> findByUserId(Integer userId);
}
