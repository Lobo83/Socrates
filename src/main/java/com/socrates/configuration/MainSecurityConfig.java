package com.socrates.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * The type Main security config.
 */
@Configuration
@EnableWebSecurity
public class MainSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * Configure.
     *
     * @param http the http
     * @throws Exception the exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/static/**").permitAll().
            and().logout().permitAll();
    }
}
