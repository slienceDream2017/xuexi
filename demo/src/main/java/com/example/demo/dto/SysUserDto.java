package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SysUserDto implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;
}
