package com.webify.learningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webify.learningplatform.domain.UserQuizAnswer;
import com.webify.learningplatform.repository.UserQuizAnswerRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class UserQuizAnswerController {
	
	@Autowired
	private UserQuizAnswerRepository userQuizAnswerRepository;
	
	@GetMapping("/userQuizAnswers")
	@ResponseBody
	public List<UserQuizAnswer> getUsers() {
		return (List<UserQuizAnswer>) userQuizAnswerRepository.findAll();
	}

	@PostMapping("/userQuizAnswers")
	void addRole(@RequestBody UserQuizAnswer userQuizAnswer) {
		userQuizAnswerRepository.save(userQuizAnswer);
	}
}

