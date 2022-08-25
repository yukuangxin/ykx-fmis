package com.ykx.ykxfmis.service.impl;

import com.ykx.ykxfmis.dao.CateGoryDao;
import com.ykx.ykxfmis.entity.CateGory;
import com.ykx.ykxfmis.service.CateGoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class CateGoryServiceImpl implements CateGoryService {
    @Resource
    private CateGoryDao cateGoryDao;
    @Override
    public CateGory findId(String name) {
        CateGory cate=cateGoryDao.selectIdByName(name);
        return cate;
    }
}
