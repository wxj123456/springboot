package com.wang.dao;

import com.wang.domain.EnjoyUser;

public interface EnjoyUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EnjoyUser record);

    int insertSelective(EnjoyUser record);

    EnjoyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnjoyUser record);

    int updateByPrimaryKey(EnjoyUser record);
}