package com.zhiyou.fmmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@ApiModel(value = "ResultVO对象",description = "封装接口返回给前端的数据")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    /**
     * 响应给前端的状态码
     */
    @ApiModelProperty(value = "响应状态码",dataType = "int" )
    private Integer code;
    /**
     * 响应给前端的提示信息
     */
    @ApiModelProperty("响应提示信息")
    private String msg;
    /**
     * 响应给前端的数据
     */
    @ApiModelProperty("响应数据")
    private Object data;


}
