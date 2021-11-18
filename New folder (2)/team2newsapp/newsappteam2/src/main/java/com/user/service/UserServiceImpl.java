package com.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
   private UserRepo repo;
	@Override
	public User addUser(User user)
	{
		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}

	@Override
	public boolean deleteUserById(Long userId) 
	{
		repo.deleteById(userId);
		return !repo.existsById(userId);
	}

}
