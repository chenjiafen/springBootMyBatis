package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/27 23:27
 */
public interface AccountDao {

    public List<Account> findAll();
}
