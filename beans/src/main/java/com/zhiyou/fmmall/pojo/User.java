package com.zhiyou.fmmall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 */
@ApiModel(value = "User对象", description = "用户/买家信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @ApiModelProperty(dataType = "int",
            required = false)
    private Integer userId;
    @ApiModelProperty(dataType = "string",
            required = true, value = "用户账号")
    private String username;
    @ApiModelProperty(dataType = "string",
            required = true, value = "用户真实姓名")
    private String realname;
    @ApiModelProperty(dataType = "string",
            required = true, value = "用户头像")
    private String userImg;
    @ApiModelProperty(dataType = "string",
            required = true, value = "用户密码")
    private String password;
    @ApiModelProperty(dataType = "string",
            required = true, value = "手机号")
    private String userMobile;
    @ApiModelProperty(dataType = "string",
            required = true, value = "昵称")
    private String nickname;
    @ApiModelProperty(dataType = "string",
            required = true, value = "邮箱")
    private String userEmail;
    @ApiModelProperty(dataType = "string",
            required = true, value = "性别")
    private String userSex;
    @ApiModelProperty(dataType = "date",
            required = true, value = "用户生日")
    private Date userBirth;
    @ApiModelProperty(dataType = "date",
            required = true, value = "注册时间")
    private Date userRegtime;
    @ApiModelProperty(dataType = "date",
            required = true, value = "修改时间")
    private Date userModtime;

}
