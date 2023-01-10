package tw.ispan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.ispan.model.Phone;

@Configuration
public class SpringAppConfig {

	@Bean
	public Phone myPhone() {
		return new Phone(1001,"iPhone15","Apple");
	}
}
