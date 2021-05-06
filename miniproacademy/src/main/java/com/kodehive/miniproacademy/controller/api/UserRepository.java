package com.kodehive.miniproacademy.controller.api;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodehive.miniproacademy.controller.api.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
}
