package com.guilherme.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.workshop.domain.User;
import com.guilherme.workshop.dto.UserDTO;
import com.guilherme.workshop.repository.UserRepository;
import com.guilherme.workshop.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(String id) {
	    return repository.findById(id)
	        .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado com ID: " + id));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(),objDTO.getName(),objDTO.getEmail());
	}
}
