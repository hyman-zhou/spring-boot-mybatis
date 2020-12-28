package com.csasc.dao;

import com.csasc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();
    User selectById(Integer id);
}
