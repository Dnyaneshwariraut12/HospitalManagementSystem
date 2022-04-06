package com.edu.HMS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HMS.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	static Optional<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}



}
