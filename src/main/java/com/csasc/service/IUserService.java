package com.csasc.service;

import com.csasc.entity.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();
    User selectById(Integer id);
}
