package com.lanou.cost.mapper;

import com.lanou.cost.bean.Cost;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostMapper {
    List<Cost> findAllCost();

    void insertCost(Cost cost);

    void deleteCost(String id);

    Cost findCostById(Integer id);

    void updateCost(Cost cost);
}
