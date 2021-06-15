package com.zhiyou.fmmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer userId;
    private String userName;
    private String userRealName;
    private  String userImg;
    private String userPwd;
}
