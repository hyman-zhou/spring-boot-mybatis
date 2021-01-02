package com.csasc.controller;

import com.csasc.common.entity.JsonResult;
import com.csasc.common.utils.ResultTool;
import com.csasc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.csasc.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "EIO")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/getUsers")
    public JsonResult getUser(HttpServletRequest request, HttpServletResponse response){
        List<User> users = userService.selectAll();
        return ResultTool.success(users);
    }
    @PostMapping(value = "/OneUser")
    public JsonResult getOneUser(HttpServletRequest request, HttpServletResponse response,@RequestBody Map<String,Object> data){
        Map<String,String[]> map = request.getParameterMap();
        for(Map.Entry<String, String[]> entry:map.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value: " + entry.getValue().toString());
        }
        for(Map.Entry<String, Object> entry:data.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value: " + entry.getValue().toString());
        }
        System.out.println("post method-----------------");
        Integer userId = (Integer) data.get("userId");
        User user = userService.selectById(userId);
        return ResultTool.success(user);
    }

    @GetMapping(value = "/OneUser")
    public JsonResult saveOneUser(HttpServletRequest request, HttpServletResponse response){
        Map<String,String[]> map = request.getParameterMap();
        for(Map.Entry<String, String[]> entry:map.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value: " + entry.getValue().toString());
        }
        System.out.println("get method-----------------");
        User user = userService.selectById(1);
        return ResultTool.success(user);
    }
}
