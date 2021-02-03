//package com.ryan.toyproject.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests()
//                .anyRequest().permitAll();
//
//        httpSecurity.formLogin()
//                .loginPage("/login");
//        httpSecurity.logout()
//                .logoutSuccessUrl("/");
//    }
//
//    @Override
//    public void configure(WebSecurity webSecurity) {
//        webSecurity.ignoring()
//
//                .antMatchers("/css/*", "/image/*", "/js/**");
//    }
//}
