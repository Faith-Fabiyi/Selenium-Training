package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// the base page helps to set some import keywords for the project
// It takes advantage of Object Oriented Programming
public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    // find the word "find" for driver.findElement(locator)
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // we pass the string that our script will get from the locator.
    // E.g, we can get the word "Dashboard" and store it in the word set
    // The "By" locator is a parameter for locating an element
    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
        // This takes the text and assigns it to the "set" word
    }

    protected void click(By locator) {
        find(locator).click();
        // This would find the element by locator and click on it
        // Could be a button or anything at all that you want to click

    }
}
