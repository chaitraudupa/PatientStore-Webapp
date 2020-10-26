package com.healthcare.bo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

//Spring Bean for RestTemplate class.
@Configuration
@ComponentScan("com.healthcare")
public class AppConfig {
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		// MappingJackson2XmlHttpMessageConverter for fetching data from XML format.
		MappingJackson2XmlHttpMessageConverter converter = new MappingJackson2XmlHttpMessageConverter();
		restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}

}
