package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
