package com.soft.mapper;

import com.soft.pojo.Admin;

public interface AdminMapper {
//    int deleteByPrimaryKey(String username);

    Admin findAdminByNameAndPwd(String username,String pwd);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}