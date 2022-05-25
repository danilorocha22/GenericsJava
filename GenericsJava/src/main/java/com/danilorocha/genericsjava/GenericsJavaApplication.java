package com.danilorocha.genericsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GenericsJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericsJavaApplication.class, args);
    }

    @Configuration
    public static class ConfigurationSpringMvc implements WebMvcConfigurer {

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addRedirectViewController("/", "/employees");
        }
    }

}
