package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SysUserRoleDto implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;
}
