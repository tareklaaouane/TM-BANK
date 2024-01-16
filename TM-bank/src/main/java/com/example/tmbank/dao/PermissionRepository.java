package com.example.tmbank.dao;


import com.example.tmbank.service.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    Optional<Permission> findByAuthority(String authority);
}