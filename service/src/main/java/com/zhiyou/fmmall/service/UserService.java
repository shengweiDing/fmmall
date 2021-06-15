package com.zhiyou.fmmall.service;

import com.zhiyou.fmmall.pojo.User;
import com.zhiyou.fmmall.vo.ResultVO;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     *  登录方法
     * @param name 账户
     * @param pwd  密码
     * @return  查询到的User对象
     */
    public ResultVO checkLogin(String name , String pwd);

}
