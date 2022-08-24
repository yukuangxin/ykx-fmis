package com.ykx.ykxfmis.dao;

import com.ykx.ykxfmis.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminDao {
    List<Admin> selectAll();
}
