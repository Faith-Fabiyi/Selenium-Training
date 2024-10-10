package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    /* Now let's create the methods which will perform actions on the fields
    There are four types of methods we can use in our page object model

    Getter methods - returns the value of an attribute
    Setter methods - receives the parameter and assigns it to an attribute
    Transition methods - is important for when our application changes to a different page
    Convenience methods - is created when combining more than one method into a single method */

    public void setUsername(String username) { // This is a setter method
        set(usernameField, username);
    }

    public void setPassword(String password) { // This is a setter method
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
        // This is a transition method so the return type cannot be "void"
        // It should be what you are transitioning to
    }

    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
        // This is a convenience method, combining the setUsername and setPassword methods
        // And returning the click method to log into the application
    }

    public String getErrorMessage() { // This is a getter method
        return find(errorMessage).getText();
    }

}
