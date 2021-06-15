package com.zhiyou.fmmall.service.impl;

import com.zhiyou.fmmall.mapper.UserMapper;
import com.zhiyou.fmmall.pojo.User;
import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 登录方法
     *
     * @param name 账户
     * @param pwd  密码
     * @return 查询到的User对象
     */

    @Resource
    private UserMapper mapper;

    @Override
    public ResultVO checkLogin(String name, String pwd) {

        User user = mapper.queryUserByName(name);
        if (user == null) {
            return new ResultVO(1, "用户不存在", null);
        } else {
            //对输入的密码进行加密
            //使用加密后的密码
            if (user.getUserPwd().equals(pwd)) {
                return new ResultVO(0, "登录成功", user);
            } else {
                return new ResultVO(1, "密码错误", user);
            }

        }

    }
}
