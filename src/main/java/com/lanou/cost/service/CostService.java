package com.lanou.cost.service;

import com.github.pagehelper.PageInfo;
import com.lanou.cost.bean.Cost;


public interface CostService {
    PageInfo<Cost> findAllCost(Integer pageNum, Integer pageSize);

    void insertCost(Cost cost);

    void deleteCost(String id);

    Cost findCostById(Integer id);

    void updateCost(Cost cost);
}
