package com.zhiyou.controller;

import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Administrator
 */

@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {

    @Resource
    UserService service;


    @RequestMapping("login")
    public ResultVO login(String name, String pwd) {

        return service.checkLogin(name, pwd);
    }

}
