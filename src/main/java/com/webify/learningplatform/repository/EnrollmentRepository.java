package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
