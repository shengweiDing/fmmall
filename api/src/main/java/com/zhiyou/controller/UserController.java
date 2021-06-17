package com.zhiyou.controller;

import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Administrator
 */

@Api(value = "用户管理", tags = "提供用户登录和注册接口")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userservice;


    @GetMapping(value = "login")
    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "用户登录账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "用户登录密码", required = true)
    })
    public ResultVO login(@RequestParam("username") String name, @RequestParam(value = "password") String pwd) {
        return userservice.checkLogin(name, pwd);

    }

    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "用户登录账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "用户登录密码", required = true)
    })
    @PostMapping(value = "regist")
    public ResultVO regist(String username, String password) {

        return userservice.userResgit(username, password);
    }
}
