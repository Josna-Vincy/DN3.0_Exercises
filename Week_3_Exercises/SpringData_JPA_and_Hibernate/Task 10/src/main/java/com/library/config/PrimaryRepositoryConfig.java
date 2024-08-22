package com.library.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.library.repository.primary",
        entityManagerFactoryRef = "myPrimaryEntityManagerFactory",  // Referencing renamed bean
        transactionManagerRef = "myPrimaryTransactionManager"  // Referencing renamed bean
)
public class PrimaryRepositoryConfig {
}

