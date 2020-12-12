package com.example.demo.service;

import com.example.demo.dto.SysRoleDto;
import com.example.demo.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    public SysRoleDto selectById(Integer id){
        return sysRoleMapper.selectById(id);
    }
}
