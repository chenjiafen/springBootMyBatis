package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/27 1:09
 */
public interface RoleDao {

    /**
     * 查询所有用户角色,包含用户对象
     * @return
     */
    public List<Role> findAll();
}
