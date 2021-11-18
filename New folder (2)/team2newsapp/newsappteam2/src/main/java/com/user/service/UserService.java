package com.user.service;

import com.user.model.User;

public interface UserService
{
	public User addUser(User user);
	public boolean deleteUserById(Long userId);
	public User updateUser(User user);

}
