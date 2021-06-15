package com.zhiyou.controller;

import com.zhiyou.fmmall.pojo.User;
import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResultVO login(@RequestParam("username") String name, @RequestParam(value = "password", defaultValue = "111111") String pwd) {
        return service.checkLogin(name, pwd);
    }

    @RequestMapping(value = "regist", method = RequestMethod.POST)
    public ResultVO regist(User user) {

        System.out.println("regist");
        return new ResultVO(10000, "success", null);
    }
}
