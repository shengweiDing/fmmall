package com.zhiyou.controller;

import com.zhiyou.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 */
@Api
@Controller
@RequestMapping("Goods")
public class GoodsController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVO addGoods(){

        return null;
    }
}
