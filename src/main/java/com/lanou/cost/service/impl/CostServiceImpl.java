package com.lanou.cost.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.cost.bean.Cost;
import com.lanou.cost.mapper.CostMapper;
import com.lanou.cost.service.CostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CostServiceImpl implements CostService {
    @Resource
    private CostMapper mapper;

    public PageInfo<Cost> findAllCost(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Cost> costList = mapper.findAllCost();
        PageInfo<Cost> pageInfo = new PageInfo<Cost>(costList);
        return pageInfo;
    }

    public void insertCost(Cost cost) {
        cost.setStatus("1");
        System.out.println(cost);
        mapper.insertCost(cost);
    }

    public void deleteCost(String id) {
        mapper.deleteCost(id);
    }

    public Cost findCostById(Integer id) {
        Cost cost = mapper.findCostById(id);
        return cost;
    }

    public void updateCost(Cost cost) {
        mapper.updateCost(cost);
    }
}
