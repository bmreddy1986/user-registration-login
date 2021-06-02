package jbr.spring.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jbr.spring.boot.service.UserService;
import jbr.spring.boot.service.UserServiceImpl;

@Configuration
@EnableAutoConfiguration
public class AppConfig {

	@Bean
	public UserService indentifierUtil() {
		return new UserServiceImpl();
	}

	/*
	 * @Bean public ObjectMapper objectMapper() { ObjectMapper mapper = new
	 * ObjectMapper();
	 * mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	 * mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
	 * 
	 * return mapper; }
	 */
}
