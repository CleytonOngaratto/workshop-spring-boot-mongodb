package com.cleyton.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleyton.workshopmongo.domain.User;
import com.cleyton.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired // Injeção de dependência automática do Spring
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
}
