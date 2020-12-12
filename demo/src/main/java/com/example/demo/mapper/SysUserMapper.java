package com.example.demo.mapper;

import com.example.demo.dto.SysUserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {

    SysUserDto selectById(@Param("id") Integer id);

    SysUserDto selectByName(@Param("name") String name);
}
