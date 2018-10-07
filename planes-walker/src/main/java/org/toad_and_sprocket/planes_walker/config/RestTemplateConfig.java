package org.toad_and_sprocket.planes_walker.config;

import java.util.List;

import org.springframework.boot.devtools.remote.client.HttpHeaderInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Lists;

@Configuration
public class RestTemplateConfig {

	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = Lists.newArrayList();
		interceptors.add(new HttpHeaderInterceptor("Content-Type", "application/json"));
		interceptors.add(new HttpHeaderInterceptor("User-Agent", "Planes-Walker-Api"));
		return restTemplate;
	}
	
}
