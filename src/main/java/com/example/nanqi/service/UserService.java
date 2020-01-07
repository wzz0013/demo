package com.example.nanqi.service;

import com.example.nanqi.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOneUser(String id);
}
