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

import com.webify.learningplatform.domain.Quiz;
import com.webify.learningplatform.repository.QuizRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class QuizController {
	@Autowired
	private QuizRepository quizRepository;
	
	@GetMapping("/quizzes")
	@ResponseBody
	public List<Quiz> getQuizQuestions() {
		return (List<Quiz>) quizRepository.findAll();
	}

	@PostMapping("/quizzes")
	void addQuizQuestion(@RequestBody Quiz quiz) {
		quizRepository.save(quiz);
	}
}
