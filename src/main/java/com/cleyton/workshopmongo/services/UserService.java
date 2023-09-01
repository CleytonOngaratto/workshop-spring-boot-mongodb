package com.cleyton.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleyton.workshopmongo.domain.User;
import com.cleyton.workshopmongo.dto.UserDTO;
import com.cleyton.workshopmongo.repository.UserRepository;
import com.cleyton.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired // Injeção de dependência automática do Spring
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}











