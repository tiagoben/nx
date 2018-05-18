package br.com.nx.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@RequestMapping("/api")
	public Object start() {
		Map<String, String> start = new HashMap<>();
		start.put("project", "NX");
		start.put("status", "starting");
		
		return start;
	}
	
}
