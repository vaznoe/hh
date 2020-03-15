package com.vaznoe.hh.config;

import com.vaznoe.hh.pages.HomePage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.vaznoe.hh.pages"})
@PropertySource(value = "classpath:application.properties")
public class PageObjectConfig {

    @Bean
    public HomePage homePage() {
        return new HomePage();
    }
}