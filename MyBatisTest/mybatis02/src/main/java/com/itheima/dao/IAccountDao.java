package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

import java.util.List;

/**
 * ClassName:    IAccountDao
 * Package:    com.itheima.dao
 * Description:
 * Datetime:    2020-01-14   14:39
 * Author:   tyler.chen
 */
public interface IAccountDao {
    /**
     * 查询所有账户，同时获取账户的所属用户名称以及它的地址信息 * @return
     */
    List<AccountUser> findAll();

    /**
     * 查询所有账户，同时获取账户的所属用户名称以及它的地址信息
     * @return
     */
    List<Account> findAllAccount();
}
