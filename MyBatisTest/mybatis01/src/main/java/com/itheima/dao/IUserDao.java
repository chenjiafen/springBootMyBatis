package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.domain.QueryVo;

import java.util.List;

/**
 * ClassName:    UserDao
 * Package:    com.itheima.dao
 * Description:
 * Datetime:    2020-01-08   17:17
 * Author:   tyler.chen
 */
public interface IUserDao {
    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User findByiId(Integer id);

    /**
     * 保存用户
     *
     * @param user
     * @return 影响数据库记录的行数
     */
    int saveUser(User user);

    /**
     * 更新用户
     *
     * @param user
     * @return 影响数据库记录的行数
     */
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 根据名称模糊查询
     *
     * @param username * @return
     */
    List<User> findByName(String username);

    /**
     * 查询总记录条数 * @return
     */
    int findTotal();

    /**
     * 根据 QueryVo 中的条件查询用户 * @param vo
     *
     * @return
     */
    List<User> findByVo(QueryVo vo);


    /**
     * 根据用户信息，查询用户列表 * @param user
     *
     * @return
     */
    List<User> findByUser(User user);


    /**
     *根据id集合查询用户
     * @param vo
     * @return
     */
    List<User> findInIds(QueryVo vo);

}
