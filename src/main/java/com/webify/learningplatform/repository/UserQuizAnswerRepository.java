package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webify.learningplatform.domain.UserQuizAnswer;

public interface UserQuizAnswerRepository extends JpaRepository<UserQuizAnswer, Long> {

}
