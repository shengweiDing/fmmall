package com.zhiyou.fmmall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@ApiModel(value = "User对象", description = "用户/买家信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @ApiModelProperty(dataType = "int", required = false)
    private Integer userId;
    @ApiModelProperty(dataType = "string", required = true, value = "用户账号")
    private String userName;
    @ApiModelProperty(dataType = "string", required = true, value = "用户真实姓名")
    private String userRealName;
    @ApiModelProperty(dataType = "string", required = true, value = "用户头像")
    private String userImg;
    @ApiModelProperty(dataType = "string", required = true, value = "用户密码")
    private String userPwd;
}
