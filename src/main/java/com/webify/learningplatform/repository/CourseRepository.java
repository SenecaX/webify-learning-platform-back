package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
