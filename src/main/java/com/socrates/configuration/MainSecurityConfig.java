package com.socrates.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

/**
 * The type Main security config.
 */
@Configuration
@EnableWebSecurity
public class MainSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    /**
     * Configure.
     *
     * @param http the http
     * @throws Exception the exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/loginPage").loginProcessingUrl("/login").
            defaultSuccessUrl("/user/userPage", true).
            failureUrl("/loginError").usernameParameter("username").passwordParameter("password").
            and().
            authorizeRequests().
            antMatchers(" / static/**").
            permitAll().
            antMatchers("/user/**").authenticated().and().logout().permitAll();
        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder()).
            usersByUsernameQuery("select username,password, enabled from user where username=?").
            authoritiesByUsernameQuery("select username, role from user_roles where username=?");
        //auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).authorities("ROLE_USER");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
