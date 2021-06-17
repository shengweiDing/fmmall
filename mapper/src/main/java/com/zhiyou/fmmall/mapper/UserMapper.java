package com.zhiyou.fmmall.mapper;

import com.zhiyou.fmmall.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public interface UserMapper {
    /**
     * 查询用户信息
     * @param userName 用户名
     * @return 查询到的用户对象
     */
    User queryUserByName(String userName);

    /**
     * 用户注册
     * @param user 注册的用户信息
     * @return 返回用户id
     */
    int insertUser(User user);
}
