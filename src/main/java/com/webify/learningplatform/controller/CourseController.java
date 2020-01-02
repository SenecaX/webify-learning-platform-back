package com.webify.learningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webify.learningplatform.domain.Course;
import com.webify.learningplatform.repository.CourseRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("/courses")
	@ResponseBody
	public List<Course> getCourses() {
		return (List<Course>) courseRepository.findAll();
	}

	@PostMapping("/courses")
	void addCourse(@RequestBody Course course) {
		courseRepository.save(course);
	}
}

