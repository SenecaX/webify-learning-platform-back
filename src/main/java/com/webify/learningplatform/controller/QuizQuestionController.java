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

import com.webify.learningplatform.domain.QuizQuestion;
import com.webify.learningplatform.repository.QuizQuestionRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class QuizQuestionController {

	@Autowired
	private QuizQuestionRepository quizQuestionRepository;
	
	@GetMapping("/quizQuestions")
	@ResponseBody
	public List<QuizQuestion> getQuizQuestions() {
		return (List<QuizQuestion>) quizQuestionRepository.findAll();
	}

	@PostMapping("/quizQuestions")
	void addQuizQuestion(@RequestBody QuizQuestion quizQuestion) {
		quizQuestionRepository.save(quizQuestion);
	}
}

