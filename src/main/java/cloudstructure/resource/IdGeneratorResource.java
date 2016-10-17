package cloudstructure.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloudstructure.service.IdGeneratorService;

@RestController
@RequestMapping("/id-generator")
public class IdGeneratorResource {

	private IdGeneratorService service;
	
	@Autowired
	public IdGeneratorResource(IdGeneratorService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getId() {
		return this.service.generateId();
	}
}
