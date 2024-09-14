package org.openapitools;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
        basePackages = {"org.openapitools", "org.openapitools.api", "org.openapitools.configuration",
                "com.jackmckenzie.scraping.bazos.service", "com.jackmckenzie.network.http.service"},
        nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@EnableJpaRepositories(basePackages = "com.jackmckenzie.network.http.repository")
@EntityScan(basePackages = "com.jackmckenzie.network.http.entity")
public class OpenApiGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenApiGeneratorApplication.class, args);
    }

    @Bean(name = "org.openapitools.OpenApiGeneratorApplication.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }
}