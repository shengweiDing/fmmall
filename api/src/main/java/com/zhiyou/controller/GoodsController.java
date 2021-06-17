package com.zhiyou.controller;

import com.zhiyou.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * @author Shengwei Ding
 */
@Api(value = "提供商品添加、修改、删除及查询的相关接口", tags = "商品管理")
@RestController
@RequestMapping("goods")
public class GoodsController {


    @PostMapping(value = "/add")
    public ResultVO addGoods() {
        return null;
    }


    @DeleteMapping(value = "/{id}")
    public ResultVO deleteGoods(@PathVariable("id") int goodsId) {
        System.out.println("----" + goodsId);
        return new ResultVO(10000, "delete", null);
    }

    @PutMapping(value = "/update")
    public ResultVO updateGoods() {
        return null;
    }


    @GetMapping(value = "/list")
    public ResultVO listGoods() {
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResultVO getGoods(@PathVariable("id") int goodsId) {
        return null;
    }
}
