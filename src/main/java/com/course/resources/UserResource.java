package com.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

	@GetMapping
	public ResponseEntity <User>findAllUsers() {
		User u = new User(1L, "Maria", "maria@teste.com", "119714656", "senha123" );
		return ResponseEntity.ok().body(u);
	}
}
