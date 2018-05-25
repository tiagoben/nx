package br.com.nx.api;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	@RequestMapping("/user")
	public Object userDetails(Principal principal) {
		return principal;
	}
	
}
