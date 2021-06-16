package com.zhiyou.controller;

import com.zhiyou.fmmall.pojo.User;
import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Administrator
 */

@Api(value = "用户管理", tags = "提供用户登录和注册接口")
@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Resource
    UserService service;


    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "用户登录账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "用户登录密码", required = false, defaultValue = "111111")
    })
    public ResultVO login(@RequestParam("username") String name, @RequestParam(value = "password", defaultValue = "111111") String pwd) {
        return service.checkLogin(name, pwd);
    }

    @ApiOperation("用户注册接口")
    @ApiImplicitParam(defaultValue = "User",value = "需要注册的用户信息")
    @RequestMapping(value = "regist", method = RequestMethod.POST)
    public ResultVO regist(User user) {

        System.out.println("regist");
        return new ResultVO(10000, "success", null);
    }
}
