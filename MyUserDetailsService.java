package com.edu.HMS.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.HMS.entity.User;
import com.edu.HMS.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {
	
	
	@Autowired
    UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UserNotFoundException {
		Optional<User> user = UserRepository.findByUserName(userName);
		user.orElseThrow(()-> new UserNotFoundException("Not found "+ userName));
		return user.map(MyUserDetails::new).get();
		//return new MyUserDetails(user);
	}

	
	

}