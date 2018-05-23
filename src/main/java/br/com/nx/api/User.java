package br.com.nx.api;

import java.util.Map;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	@RequestMapping("/user")
	public Object userDetails(OAuth2AuthenticationToken auth) {
		Map<String, Object> attributes = auth.getPrincipal().getAttributes();
		return attributes;
	}
	
}
