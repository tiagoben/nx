package br.com.nx.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@RequestMapping("/hello")
	public Object userDetails() {
		Map<String, Object> hello = new HashMap<>();
		hello.put("message", "hello world");
		return hello;
	}
}
