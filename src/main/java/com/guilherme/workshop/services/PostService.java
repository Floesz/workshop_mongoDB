package com.guilherme.workshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.workshop.domain.Post;
import com.guilherme.workshop.repository.PostRepository;
import com.guilherme.workshop.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;


	public Post findById(String id) {
		return repository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado com ID: " + id));
	}
}
