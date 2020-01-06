package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.QuizQuestion;


public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long>  {

}

