package com.zhiyou.fmmall.mapper;

import com.zhiyou.fmmall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface UserMapper {
    /**
     * 查询用户信息
     * @param userName 用户名
     * @return 查询到的用户对象
     */
    public User queryUserByName(String userName);
}
