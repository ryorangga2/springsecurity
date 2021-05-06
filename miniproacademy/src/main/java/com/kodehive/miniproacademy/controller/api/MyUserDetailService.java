package com.kodehive.miniproacademy.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kodehive.miniproacademy.controller.api.models.MyUserDetails;
import com.kodehive.miniproacademy.controller.api.models.User;

@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	Optional<User> user = userRepository.findByUserName(userName);
	user.orElseThrow(() -> new UsernameNotFoundException("Not Found: "+ userName));
	
	return user.map(MyUserDetails::new).get();
	
	}

	
}
