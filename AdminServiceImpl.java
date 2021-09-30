package com.bsc.service.impl;

import com.bsc.mapper.AdminMapper;
import com.bsc.pojo.Admin;
import com.bsc.pojo.AdminExample;
import com.bsc.service.AdminService;
import com.bsc.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String name, String pwd) {
        AdminExample example = new AdminExample();
        example.createCriteria().andANameEqualTo(name);
        List<Admin> list = adminMapper.selectByExample(example);
        if (list.size()>0){
            Admin admin = list.get(0);
            String mdPWD = MD5Util.md5Encrypt32Lower(pwd);
            if (mdPWD.equals(admin.getaPass())){
                return admin;
            }
        }
        return null;
    }
}
