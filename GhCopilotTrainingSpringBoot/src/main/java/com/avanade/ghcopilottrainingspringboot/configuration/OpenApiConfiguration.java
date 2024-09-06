package com.avanade.ghcopilottrainingspringboot.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI labOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("GhCopilotTraining Lab SpringBoot API")
                        .version("1.0")
                        .description("This is a sample GhCopilotTrainingSpringBoot server"));
    }
}
