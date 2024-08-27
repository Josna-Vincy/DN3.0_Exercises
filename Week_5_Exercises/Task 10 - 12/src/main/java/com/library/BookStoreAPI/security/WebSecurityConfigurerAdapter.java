package com.library.BookStoreAPI.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public abstract class WebSecurityConfigurerAdapter {
    protected abstract void configure(AuthenticationManagerBuilder auth) throws Exception;

    protected AuthenticationManager authenticationManagerBean() {
        return null;
    }

    protected abstract void configure(HttpSecurity httpSecurity) throws Exception;
}
