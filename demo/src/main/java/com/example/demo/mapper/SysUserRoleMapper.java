package com.example.demo.mapper;

import com.example.demo.dto.SysUserRoleDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserRoleMapper {
    List<SysUserRoleDto> listByUserId(@Param("userId") Integer userId);
}

