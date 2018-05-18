package br.com.nx.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@Value("${hellow.world.name}") 
	private String helloWorldName;
	
	@RequestMapping("/api")
	public Object start() {
		Map<String, String> start = new HashMap<>();
		start.put("project", "NX");
		start.put("hellow.world.name", helloWorldName);
		
		return start;
	}
	
}
