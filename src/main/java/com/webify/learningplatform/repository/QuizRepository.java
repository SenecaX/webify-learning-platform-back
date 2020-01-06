package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>   {

}

