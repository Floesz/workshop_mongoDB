package com.guilherme.workshop.dto;

import java.io.Serializable;

import com.guilherme.workshop.domain.User;

public class AuthorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}

	public AuthorDTO(User obj) {
		setId(obj.getId());
		setName(obj.getName());
	}

	public AuthorDTO(String id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
