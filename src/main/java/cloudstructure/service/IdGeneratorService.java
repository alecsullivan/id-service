package cloudstructure.service;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class IdGeneratorService {

	public String generateId() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		
		return id;
	}
}
