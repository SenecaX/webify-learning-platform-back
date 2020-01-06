package com.webify.learningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webify.learningplatform.domain.Lecture;
import com.webify.learningplatform.repository.LectureRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class LectureController {
	@Autowired
	private LectureRepository lectureRepository;

	@RequestMapping(value ="/lectures")
	@ResponseBody
	public List<Lecture> getLectures() {
		return (List<Lecture>) lectureRepository.findAll();
	}

	@PostMapping("/lectures")
	void addLecture(@RequestBody Lecture lecture) {
		lectureRepository.save(lecture);
	}
}
