package in.mane.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity httpSec) throws Exception {

		// logic to customize security
		httpSec.authorizeHttpRequests((request) -> request
					.requestMatchers("/", "/loginCheck", "/contact", "swagger-ui/index.html").permitAll()
					.anyRequest().authenticated()
				).formLogin(withDefaults());

		return httpSec.build();
	}

}
