package com.zhiyou.fmmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    /**
     * 响应给前端的状态码
     */
    private Integer code;
    /**
     * 响应给前端的提示信息
     */
    private String msg;
    /**
     * 响应给前端的数据
     */
    private Object data;


}
