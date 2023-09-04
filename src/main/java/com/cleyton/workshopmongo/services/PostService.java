package com.cleyton.workshopmongo.services;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleyton.workshopmongo.domain.Post;
import com.cleyton.workshopmongo.repository.PostRepository;
import com.cleyton.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired // Injeção de dependência automática do Spring
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
