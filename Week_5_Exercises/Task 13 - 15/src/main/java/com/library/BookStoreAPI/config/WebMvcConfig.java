package com.library.BookStoreAPI.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer
                .favorParameter(true)  // Enable URL parameter-based content negotiation
                .parameterName("mediaType")
                .ignoreAcceptHeader(false)  // Honor the Accept header
                .defaultContentType(MediaType.APPLICATION_JSON)  // Default to JSON
                .mediaType("json", MediaType.APPLICATION_JSON)
                .mediaType("xml", MediaType.APPLICATION_XML);
    }
}
