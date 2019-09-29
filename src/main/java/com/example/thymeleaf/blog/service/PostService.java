package com.example.thymeleaf.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymeleaf.blog.model.Post;
import com.example.thymeleaf.blog.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public List<Post> findAll() {
		return postRepository.findAll();
	}

	public Post getOne(Long id) {
		return postRepository.getOne(id);
	}

	public Post save(Post post) {
		return postRepository.saveAndFlush(post);
	}

	public void delete(Post post) {
		postRepository.delete(post);
	}
}
