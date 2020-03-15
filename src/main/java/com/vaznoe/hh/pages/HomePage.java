package com.vaznoe.hh.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Component
public class HomePage extends BasePage {

    private static final By HOME_PAGE = By.cssSelector("#ntp-contents");
    private static final By SEARCH = By.xpath("//input[@name='q']");
    private static final By SEARCH_RESULT = By.xpath("(//div[@class='r']/a)[1]");

    @Override
    public HomePage openPage() {
        open(property.getGoogleUrl());
        return new HomePage();
    }

    @Step("Verify Home page opened")
    public HomePage verifyHomePageOpened() {
        $(HOME_PAGE).isDisplayed();
        return this;
    }

    @Step("Enter {textValue} into search field")
    public HomePage searchTo(String textValue) {
        $(SEARCH).setValue(textValue).pressEnter();
        return this;
    }

    @Step("Verify search result")
    public String verifyResult() {
        return $(SEARCH_RESULT).getAttribute("href");
    }
}