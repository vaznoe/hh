package com.vaznoe.hh.config;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.vaznoe.hh", "com.codeborne.selenide", "io.qameta.allure"})
public class TestConfig {

    @Bean
    public WebDriver getDriver() {
        return WebDriverRunner.getAndCheckWebDriver();
    }
}