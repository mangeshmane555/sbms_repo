package in.mane.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import in.mane.interceptor.RequestLogInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer  {

	@Autowired
	private RequestLogInterceptor logInterceptor; 

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logInterceptor);
	}

}
