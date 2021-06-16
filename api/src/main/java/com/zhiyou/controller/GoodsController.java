package com.zhiyou.controller;

import com.zhiyou.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 */
@Api(value = "提供商品添加、修改、删除及查询的相关接口", tags = "商品管理")
@Controller
@RequestMapping("goods")
public class GoodsController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultVO addGoods() {
        return null;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResultVO deleteGoods(@PathVariable("id") int goodsId) {
        System.out.println("----" + goodsId);
        return new ResultVO(10000, "delete", null);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResultVO updateGoods() {
        return null;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVO listGoods() {
        return null;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResultVO getGoods(@PathVariable("id") int goodsId) {
        return null;
    }
}
