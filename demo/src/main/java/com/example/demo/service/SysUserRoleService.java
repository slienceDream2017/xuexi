package com.example.demo.service;

import com.example.demo.dto.SysUserRoleDto;
import com.example.demo.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    public List<SysUserRoleDto> listByUserId(Integer userId) {
        return sysUserRoleMapper.listByUserId(userId);
    }
}
