package com.portal.api.client;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	private final long MAX_TIMEOUT_LIMIT = 3000000L;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMillis(MAX_TIMEOUT_LIMIT))
				.setReadTimeout(Duration.ofMillis(MAX_TIMEOUT_LIMIT))
				.build();
	}
}
