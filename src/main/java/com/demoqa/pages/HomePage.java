package com.demoqa.pages;

import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms'");

    public FormsPage goToForms() {
        click(formsCard);
        return new FormsPage("testing");
    }
}
