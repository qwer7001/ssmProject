package com.lanou.cost.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.cost.bean.Cost;
import com.lanou.cost.service.CostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class CostController {
    @Resource
    private CostService service;

    // 主页
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    // 资费管理页面
    @RequestMapping(value = "/feelist")
    public String fee() {
        return "fee/fee_list";
    }

    // fee_modi 页面
    @RequestMapping(value = "/feemodi")
    public String modi() {
        return "fee/fee_modi";
    }

    // fee_add 页面
    @RequestMapping(value = "/feeadd")
    public String add() {
        return "fee/fee_add";
    }

    // fee_detail 页面
    @RequestMapping(value = "/feedetail")
    public String detail() {
        return "fee/fee_detail";
    }

    // 获取所有资费信息
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public PageInfo<Cost> getAllCost(@RequestParam("pageNum") Integer pn, @RequestParam("pageSize") Integer ps) {
        PageInfo<Cost> pageInfo = service.findAllCost(pn,ps);
        return pageInfo;
    }
    // 添加
    @RequestMapping(value = "/addCost")
    @ResponseBody
    public String addCost(Cost cost){
        System.out.println(cost);
        service.insertCost(cost);
        return "1";
    }

    // 查看
    @RequestMapping(value = "/showCost")
    @ResponseBody
    public Cost showCost(@RequestParam("sid") Integer id) {
        Cost cost = service.findCostById(id);
        System.out.println(cost);
        return cost;
    }
}
