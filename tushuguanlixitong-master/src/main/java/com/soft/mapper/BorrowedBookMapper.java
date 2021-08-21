package com.soft.mapper;

import com.soft.pojo.BorrowedBook;

public interface BorrowedBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowedBook record);

    int insertSelective(BorrowedBook record);

    BorrowedBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BorrowedBook record);

    int updateByPrimaryKey(BorrowedBook record);
}