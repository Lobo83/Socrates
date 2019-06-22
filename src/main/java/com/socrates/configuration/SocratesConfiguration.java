package com.socrates.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The type Socrates configuration.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.socrates.persistence.repository")
@EnableTransactionManagement
@EnableWebMvc
@EntityScan(basePackages = "com.socrates.persistence.model")
public class SocratesConfiguration implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //by default prefix = "/WEB-INF/" and  suffix = ".jsp"
        registry.jsp("/WEB-INF/", ".jsp");
    }

}
