package com.chenjiafeng.dao;

import com.chenjiafeng.daomain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/30 12:32
 */
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("SELECT * from users")
    public List<User> findAllUser();


    /**
     * 根据id查询
     * @return
     */
    @Select("select * from users where uid=#{id}")
    public User findUserById(Integer id);

    /**
     * 根据username模糊查询
     * @param username
     * @return
     */
    @Select("select * from users where username like \"%\"#{username}\"%\"")
    public List<User> findUserByUsername(String username);

    /**
     * 查询总的用户数量
     * @return
     */
    @Select("select account(*) from users")
    public Integer findTotalCount();

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into users values(null,#{username},#{password},#{name},#{birthday})")
    public void insertUser(User user);

    /**
     * 更新用户
     * @param user
     */
    @Update("update users set username=#{username},password=#{password},name=#{name}," +
            "birthday=#{birthday} where uid=#{uid}")
    public void updateUser(User user);

    /**
     * 根据id来删除用户
     * @param id
     */
    @Delete("delete form users where uid=#{uid}")
    public void delUserById(Integer id);

}
