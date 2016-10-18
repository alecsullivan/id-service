package com.dorffi.id.service;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class IdService {

	public String generateId() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		
		return id;
	}
}
