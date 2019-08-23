package com.lecar.freecar.mapper.demo;

import com.lecar.freecar.model.demo.Ssqcert;

public interface SsqcertMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Ssqcert record);

    int insertSelective(Ssqcert record);

    Ssqcert selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Ssqcert record);

    int updateByPrimaryKey(Ssqcert record);
}