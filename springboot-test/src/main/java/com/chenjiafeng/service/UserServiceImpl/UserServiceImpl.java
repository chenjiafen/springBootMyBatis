package com.chenjiafeng.service.UserServiceImpl;

import com.chenjiafeng.domain.Users;
import com.chenjiafeng.mapper.UserMapper;
import com.chenjiafeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2020-01-06 17:46
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int insertUser(Users users) {
        return userMapper.insertUser(users);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Users findByid(Integer id) {
        return userMapper.findByid(id);
    }

    @Override
    public int updateUser(Users users) {
        return userMapper.updateUser(users);
    }
}
