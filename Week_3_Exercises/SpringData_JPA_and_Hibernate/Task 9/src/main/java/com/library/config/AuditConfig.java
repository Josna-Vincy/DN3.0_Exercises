package com.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "customAuditorProvider")
public class AuditConfig {

    @Bean(name = "customAuditorProvider")
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.ofNullable("Admin");
    }
}

