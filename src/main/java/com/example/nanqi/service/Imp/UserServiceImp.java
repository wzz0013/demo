package com.example.nanqi.service.Imp;

import com.example.nanqi.mapper.UserMapper;
import com.example.nanqi.pojo.User;
import com.example.nanqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
public class UserServiceImp implements UserService {
       @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

        @Override
        public User findOneUser(String id) {
            return userMapper.findOneUser(id);
        }
    }
