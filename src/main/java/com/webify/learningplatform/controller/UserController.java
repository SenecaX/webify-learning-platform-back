package com.webify.learningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webify.learningplatform.domain.Course;
import com.webify.learningplatform.domain.User;
import com.webify.learningplatform.repository.UserRepository;
import com.webify.learningplatform.service.GenericService;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
@RequestMapping("/private")
public class UserController {
	
	private UserRepository userRepository;
	
	@Autowired
	private GenericService userService;
	
	@RequestMapping(value ="/users")
	@ResponseBody
	public List<User> getUsers() {
		return userService.findAllUsers();
	}
	
    @GetMapping("/currentUser")
    public Object currentUserName() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getPrincipal();
    }

}
