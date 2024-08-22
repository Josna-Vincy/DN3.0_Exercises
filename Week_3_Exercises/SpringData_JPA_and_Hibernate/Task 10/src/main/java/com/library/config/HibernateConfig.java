package com.library.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class HibernateConfig {

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        Properties hibernateProperties = new Properties();
        hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        hibernateProperties.put(Environment.SHOW_SQL, "true");
        hibernateProperties.put(Environment.HBM2DDL_AUTO, "update");
        hibernateProperties.put(Environment.BATCH_STRATEGY, "50");

        sessionFactory.setHibernateProperties(hibernateProperties);
        sessionFactory.setPackagesToScan("com.library.entity");

        return sessionFactory;
    }

    @Bean
    public SessionFactory getSessionFactory(LocalSessionFactoryBean sessionFactoryBean) {
        return sessionFactoryBean.getObject();
    }
}
