package com.guilherme.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guilherme.workshop.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
