package com.zhiyou.fmmall.service.impl;

import com.zhiyou.fmmall.mapper.UserMapper;
import com.zhiyou.fmmall.pojo.User;
import com.zhiyou.fmmall.service.UserService;
import com.zhiyou.fmmall.utils.Md5Utils;
import com.zhiyou.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录方法
     *
     * @param name 账户
     * @param pwd  密码
     * @return vo对象
     */
    @Override
    public ResultVO checkLogin(String name, String pwd) {
        User user = userMapper.queryUserByName(name);
        if (user == null) {
            return new ResultVO(10001, "登录失败，用户不存在", null);
        } else {
            if (user.getPassword().equals(Md5Utils.md5(pwd))) {
                return new ResultVO(10000, "登录成功！", user);
            } else {
                return new ResultVO(10001, "登录失败，密码错误", null);
            }
        }

    }

    /**
     * 用户注册
     *
     * @param name 用户名
     * @param pwd  密码
     * @return vo对象
     */

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultVO userResgit(String name, String pwd) {
        synchronized (this) {
            //1. 根据用户查询，这个用户是否已经被注册
            User user = userMapper.queryUserByName(name);
            //2. 如果没有被注册进行保存操作
            if (user == null) {
                String md5Pwd = Md5Utils.md5(pwd);
                user = new User();
                user.setUsername(name);
                user.setPassword(md5Pwd);
                user.setUserImg("img/default.png");
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int i = userMapper.insertUser(user);
                if (i > 0) {
                    return new ResultVO(10000, "注册成功", user);
                } else {
                    return new ResultVO(10002, "注册失败", null);
                }
            } else {
                return new ResultVO(10001, "用户名已经被注册！", null);
            }

        }
    }
}
