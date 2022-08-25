package com.ykx.ykxfmis.dao;

import com.ykx.ykxfmis.entity.CateGory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CateGoryDao {
    CateGory selectIdByName(@Param("name") String name);
}
