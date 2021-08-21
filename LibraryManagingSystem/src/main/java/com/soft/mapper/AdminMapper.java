package com.soft.mapper;

import com.soft.pojo.AdminEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("adminMapper")
public interface AdminMapper {
//    int deleteByPrimaryKey(String username);

    AdminEntity findAdminByNameAndPwd(String username, String pwd);

    int insert(AdminEntity record);

    int insertSelective(AdminEntity record);

    AdminEntity selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(AdminEntity record);

    int updateByPrimaryKey(AdminEntity record);
}