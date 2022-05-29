package com.miniproject.batchprocessingv2.repository;

import com.miniproject.batchprocessingv2.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}