package com.example.demo.mapper;

import com.example.demo.dto.SysRoleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper {
    SysRoleDto selectById(@Param("id") Integer id);
}
