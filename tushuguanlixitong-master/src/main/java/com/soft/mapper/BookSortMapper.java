package com.soft.mapper;

import com.soft.pojo.BookSort;

public interface BookSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookSort record);

    int insertSelective(BookSort record);

    BookSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookSort record);

    int updateByPrimaryKey(BookSort record);
}