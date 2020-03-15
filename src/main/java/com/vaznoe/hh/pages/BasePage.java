package com.vaznoe.hh.pages;

import com.vaznoe.hh.config.PageObjectConfig;
import com.vaznoe.hh.config.TestConfig;
import com.vaznoe.hh.config.properties.TestProperty;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = { TestConfig.class, PageObjectConfig.class })
public abstract class BasePage {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected TestProperty property;

    public abstract <T> T openPage();
}