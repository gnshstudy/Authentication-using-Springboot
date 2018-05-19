package com.ganesh.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
