package com.webify.learningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webify.learningplatform.domain.Module;
import com.webify.learningplatform.repository.ModuleRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class ModuleController {
	@Autowired
	private ModuleRepository moduleRepository;

	@RequestMapping(value ="/modules")
	@ResponseBody
	public List<Module> getModules() {
		return (List<Module>) moduleRepository.findAll();
	}

	@PostMapping("/modules")
	void addModule(@RequestBody Module module) {
		moduleRepository.save(module);
	}
}
