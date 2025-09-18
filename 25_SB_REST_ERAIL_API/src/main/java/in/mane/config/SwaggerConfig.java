package in.mane.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Swagger2 Lesser versions than Spring Boot 3 versions
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDoc() {
		 
		return new Docket(DocumentationType.SWAGGER_2)
											.select()
											.apis(RequestHandlerSelectors.basePackage("in.mane.rest"))
											.paths(PathSelectors.any())
											.build();
	}		
	

}
