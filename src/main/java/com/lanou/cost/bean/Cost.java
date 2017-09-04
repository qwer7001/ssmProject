package com.lanou.cost.bean;

import java.sql.Timestamp;
import java.util.Date;

public class Cost {
    private Integer costId;
    private String name; // 资费名称
    private Integer baseDuration; // 基本时长
    private Double baseCost; // 基本费用
    private Double unitCost; // 单位费用
    private String status; // 状态
    private String des; // 描述
    private Timestamp creatime; // 创建时间
    private Timestamp startime; // 开通时间
    private String costType; // 资费类型

    @Override
    public String toString() {
        return "Cost{" +
                "costId=" + costId +
                ", name='" + name + '\'' +
                ", baseDuration=" + baseDuration +
                ", baseCost=" + baseCost +
                ", unitCost=" + unitCost +
                ", status='" + status + '\'' +
                ", des='" + des + '\'' +
                ", creatime=" + creatime +
                ", startime=" + startime +
                ", costType='" + costType + '\'' +
                '}';
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(Double baseCost) {
        this.baseCost = baseCost;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    public Timestamp getStartime() {
        return startime;
    }

    public void setStartime(Timestamp startime) {
        this.startime = startime;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }
}


//        `cost_id` int(11) DEFAULT NULL,
//        `name` varchar(50) NOT NULL,
//        `base_duration` int(11) DEFAULT NULL,
//        `base_cost` int(11) DEFAULT NULL,
//        `unit_cost` int(11) DEFAULT NULL,
//        `status` char(1) DEFAULT NULL,
//        `descr` varchar(100) DEFAULT NULL,
//        `creatime` datetime DEFAULT NULL,
//        `startime` datetime DEFAULT NULL,
//        `cost_type` char(1) DEFAULT NULL