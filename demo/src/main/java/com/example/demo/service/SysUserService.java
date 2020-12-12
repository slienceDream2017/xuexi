package com.example.demo.service;

import com.example.demo.dto.SysUserDto;
import com.example.demo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUserDto selectById(Integer id) {
        return sysUserMapper.selectById(id);
    }

    public SysUserDto selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }
}


