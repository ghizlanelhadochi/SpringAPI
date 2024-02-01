package com.example.springboot.learnepringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // autorise toutes les URL
            .allowedOrigins("*")      // autorise les requêtes de n'importe quelle origine
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // autorise les méthodes HTTP spécifiées
            .allowedHeaders("*");     // autorise tous les en-têtes dans la requête
    }
}
