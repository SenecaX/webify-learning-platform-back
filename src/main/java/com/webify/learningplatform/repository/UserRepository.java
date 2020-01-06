package com.webify.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.webify.learningplatform.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}