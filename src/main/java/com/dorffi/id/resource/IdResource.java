package com.dorffi.id.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dorffi.id.service.IdService;

@RestController
@RequestMapping("/id-generator")
public class IdResource {

	private IdService service;
	
	@Autowired
	public IdResource(IdService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getId() {
		return this.service.generateId();
	}
}
