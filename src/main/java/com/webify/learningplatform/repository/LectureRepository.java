package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

}
