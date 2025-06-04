package com.guilherme.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAlll(){
		User maria = new User("1","maria","maria@gmail.com");
		User gui = new User("2","gui","gui@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,gui));
		return ResponseEntity.ok().body(list);
	}
}
