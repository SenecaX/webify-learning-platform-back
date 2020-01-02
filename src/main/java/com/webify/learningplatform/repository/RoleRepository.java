package com.webify.learningplatform.repository;

import org.springframework.data.repository.CrudRepository;

import com.webify.learningplatform.domain.Role;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}