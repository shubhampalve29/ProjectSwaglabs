package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.example.utils.Helper;
import com.example.utils.LocatorUtil;
import java.util.Map;

public class LoginPage {
    WebDriver driver;
    Map<String, Map<String, String>> locators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.locators = LocatorUtil.loadLocators("locators/LoginPageLocators.yaml");
    }

    private WebElement element(String locatorName) {
        return driver.findElement(LocatorUtil.getLocator(locators, locatorName));
    }

    public void enterUsername(String username) {
        element("username_field").sendKeys(username);
    }

    public void enterPassword(String password) {
        element("password_field").sendKeys(password);
    }

    /**
     * to wait for element until it becomes clickable 
     */
    public void clickOnLoginButton() {
        WebElement loginButton = element("login_button");
        Helper.waitForElementToBeClickable(driver, loginButton, 10);
        loginButton.click();
    }

    /**
     * to explicitly wait for an element until it becomes visible
     * @return
     */
    public boolean homePageDisplayed() {
        WebElement homePageTitle = element("homePageTitle");
        Helper.waitForElementVisibility(driver, homePageTitle, 10);
        return homePageTitle.isDisplayed();
    }

    // Other methods to interact with the login page
}