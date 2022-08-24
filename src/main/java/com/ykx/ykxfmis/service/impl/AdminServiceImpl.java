package com.ykx.ykxfmis.service.impl;

import com.ykx.ykxfmis.dao.AdminDao;
import com.ykx.ykxfmis.dao.UserDao;
import com.ykx.ykxfmis.entity.Admin;
import com.ykx.ykxfmis.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
   private AdminDao adminDao;
    @Override
    public List<Admin> selectAll() {

        List<Admin> adminList= adminDao.selectAll();
        return adminList;
    }
}
