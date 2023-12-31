package sg.nus.edu.iss.day21_workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {
    
    @Bean
    public OpenAPI OpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("My PAF Day21 Workshop API on Swagger")
                .description("PAF Day21 Workshop")
                .version("Version 1.0"));
    }

    // http://localhost:8080/swagger-ui/index.html#/

}
