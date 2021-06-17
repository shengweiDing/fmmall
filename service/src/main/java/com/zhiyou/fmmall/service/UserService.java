package com.zhiyou.fmmall.service;

import com.zhiyou.fmmall.vo.ResultVO;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     * 登录方法
     *
     * @param name 账户
     * @param pwd  密码
     * @return vo对象
     */
    public ResultVO checkLogin(String name, String pwd);

    /**
     * 用户注册
     *
     * @param name 用户名
     * @param pwd  密码
     * @return vo对象
     */
    ResultVO userResgit(String name, String pwd);


}
