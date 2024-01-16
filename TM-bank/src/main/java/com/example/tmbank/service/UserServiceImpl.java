package com.example.tmbank.service;


import lombok.AllArgsConstructor;
import com.example.tmbank.dao.PermissionRepository;
import com.example.tmbank.dao.RoleRepository;
import com.example.tmbank.dao.UserRepository;
import com.example.tmbank.dtos.user.PermissionVo;
import com.example.tmbank.dtos.user.RoleVo;
import com.example.tmbank.dtos.user.UserVo;
import com.example.tmbank.service.model.Permission;
import com.example.tmbank.service.model.Role;
import com.example.tmbank.service.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements IUserService, UserDetailsService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private ModelMapper modelMapper;
    private PermissionRepository permissionRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVo userVo = modelMapper.map(userRepository.findByUsername(username), UserVo.class);
        List<RoleVo> permissions = new ArrayList<>();
        userVo.getAuthorities().forEach(
                roleVo -> roleVo.getAuthorities().forEach(
                        permission -> permissions.add(
                                RoleVo.builder().authority(permission.getAuthority()).build())));
        userVo.getAuthorities().addAll(permissions);
        return userVo;
    }

    @Override
    public void save(UserVo userVo) {
        User user = modelMapper.map(userVo, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAuthorities(user.getAuthorities().stream().map(bo ->
                        roleRepository.findByAuthority(bo.getAuthority()).get()).
                collect(Collectors.toList()));
        userRepository.save(user);
    }

    @Override
    public void save(RoleVo roleVo) {
        Role role = modelMapper.map(roleVo, Role.class);
        role.setAuthorities(role.getAuthorities().stream().map(bo ->
                        permissionRepository.findByAuthority(bo.getAuthority()).get()).
                collect(Collectors.toList()));
        roleRepository.save(role);
    }

    @Override
    public void save(PermissionVo vo) {
        permissionRepository.save(modelMapper.map(vo, Permission.class));
    }

    @Override
    public RoleVo getRoleByName(String authority) {
        return modelMapper.map(roleRepository.findByAuthority(authority).get(), RoleVo.class);
    }

    @Override
    public PermissionVo getPermissionByName(String authority) {
        return modelMapper.map(permissionRepository.findByAuthority(authority), PermissionVo.class);
    }
}