package com.khabalita.springboot.libraryApi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/api-library/**") //todos los path deben empezar con /gestin
                .allowedOrigins("http://localhost:4200") //aca van explicitos las dos rutas que pueden acceder a la api
                .allowedMethods("GET", "POST", "PUT", "DELETE") //los metodos que acepta
                .allowedHeaders("*"); //los headers, tienen que ver con Security
        }

}
