package com.example.tmbank.service;

import com.example.tmbank.dtos.user.PermissionVo;
import com.example.tmbank.dtos.user.RoleVo;
import com.example.tmbank.dtos.user.UserVo;

public interface IUserService {
    void save(UserVo user);

    void save(RoleVo role);

    void save(PermissionVo vo);

    RoleVo getRoleByName(String role);

    PermissionVo getPermissionByName(String authority);

}