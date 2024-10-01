package com.example.stepdefinitions;

import com.example.pages.LoginPage;
import com.example.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = DriverFactory.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
        loginPage.enterUsername("standard_user");
        Thread.sleep(3000);
        loginPage.enterPassword("secret_sauce");
        Thread.sleep(3000);
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_home_page() {
        assertTrue(loginPage.homePageDisplayed());
    }
}