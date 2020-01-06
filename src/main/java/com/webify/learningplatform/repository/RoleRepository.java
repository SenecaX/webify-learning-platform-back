package com.webify.learningplatform.repository;

import org.springframework.data.repository.CrudRepository;

import com.webify.learningplatform.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}