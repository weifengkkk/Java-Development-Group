package com.soft.mapper;

import com.soft.pojo.Luser;

public interface LuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Luser record);

    int insertSelective(Luser record);

    Luser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Luser record);

    int updateByPrimaryKey(Luser record);
}