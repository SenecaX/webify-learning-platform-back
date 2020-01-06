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

import com.webify.learningplatform.domain.Enrollment;
import com.webify.learningplatform.repository.EnrollmentRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class EnrollmentController {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@GetMapping("/enrollment")
	@ResponseBody
	public List<Enrollment> getEnrollements() {
		return (List<Enrollment>) enrollmentRepository.findAll();
	}

	@PostMapping("/enrollment")
	void addEnrollment(@RequestBody Enrollment enrollment) {
		enrollmentRepository.save(enrollment);
	}
}
