package com.csasc.store.modules.ums.controller;


import com.csasc.store.common.api.CommonPage;
import com.csasc.store.common.api.CommonResult;
import com.csasc.store.modules.ums.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-07
 */
@RestController
@Api(tags = "UmsMemberController",description = "会员登录注册管理")
@RequestMapping("/ums/umsMember")
public class UmsMemberController {

    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone){
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,@RequestParam String authCode) {
        return memberService.verifyAuthCode(telephone,authCode);
    }

}

