package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.QuizAnswer;

public interface QuizAnswerRepository extends JpaRepository<QuizAnswer, Long> {

}
