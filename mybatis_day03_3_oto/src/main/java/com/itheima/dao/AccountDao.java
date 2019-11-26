package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/26 20:46
 */
public interface AccountDao {

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询所有账户和用户信息
     * @return
     */
    public List<AccountUser> findAllUser();

    /**
     * 查询所有账户和用户信息第二种方法
     * 直接在Account添加User对象
     * @return
     */
    public List<Account> findAllUsers();
}
