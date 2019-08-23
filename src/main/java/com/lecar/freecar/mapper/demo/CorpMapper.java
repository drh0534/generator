package com.lecar.freecar.mapper.demo;

import com.lecar.freecar.model.demo.Corp;

public interface CorpMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Corp record);

    int insertSelective(Corp record);

    Corp selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Corp record);

    int updateByPrimaryKey(Corp record);
}