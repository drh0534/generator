package com.lecar.freecar.mapper.demo;

import com.lecar.freecar.model.demo.TransportTruckInput;
import java.math.BigDecimal;

public interface TransportTruckInputMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(TransportTruckInput record);

    int insertSelective(TransportTruckInput record);

    TransportTruckInput selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(TransportTruckInput record);

    int updateByPrimaryKey(TransportTruckInput record);
}