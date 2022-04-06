package com.edu.HMS.service;

import java.util.Optional;

import com.edu.HMS.entity.User;

public interface UserDetailsService {

	UserDetails loadUserByUsername(String userName) throws UserNotFoundException;


}
