package com.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.User;

public interface UserRepo  extends JpaRepository<User,Long>
{
	Optional<User> findByUserName(String userName);
}
