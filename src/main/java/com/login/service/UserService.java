package com.login.service;

import com.login.dto.UserDTO;
import com.login.exception.UserException;
import com.login.model.User;

public interface UserService {

	public User addUser(User user, boolean isAdmin) throws UserException;

	public User userLogIn(UserDTO user) throws UserException;

}
