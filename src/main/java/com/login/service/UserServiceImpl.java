package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.dto.UserDTO;
import com.login.exception.UserException;
import com.login.model.User;
import com.login.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User addUser(User user, boolean isAdmin) throws UserException {

		// User u = userRepository.findByEmail(user.getEmail());

		// if (u != null) {
		// 	throw new UserException("User with this email " + user.getEmail() + " is already present.");
		// }

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		if (isAdmin) {
			user.setRoles("ROLE_ADMIN");
		} else {
			user.setRoles("ROLE_USER");
		}

		return userRepository.save(user);

	}

	@Override
	public User userLogIn(UserDTO user) throws UserException {
		return null;
	}

}
