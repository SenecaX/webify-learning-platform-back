package com.webify.learningplatform.service;

import java.util.List;

import com.webify.learningplatform.domain.RandomCity;
import com.webify.learningplatform.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}