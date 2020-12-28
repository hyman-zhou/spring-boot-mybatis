package com.csasc.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csasc.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "EIO")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/getUser")
    public JSONObject getUser(HttpServletRequest request, HttpServletResponse response){
        JSONObject obj = new JSONObject();
        obj.put("user","1111");
    return obj;
    }
}
