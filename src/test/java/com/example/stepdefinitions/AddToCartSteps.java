package com.example.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.example.pages.HomePage;
import com.example.utils.DriverFactory;
import com.example.utils.TestDataHandler;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {

	private WebDriver driver;
	private HomePage homePage;

	public AddToCartSteps() {
		this.driver = DriverFactory.getDriver();
		this.homePage = new HomePage(driver);
	}

	@Then("user added a product to cart")
	public void user_added_a_product_to_cart() throws InterruptedException {
		homePage.clickOnaddtoCartButton();
		Thread.sleep(2000);
	}

	@When("user added a product to cart and observed the product name")
	public void user_added_a_product_to_cart_and_observed_the_product_name() {
		homePage.clickOnaddtoCartButton();
	}

	@When("user clicks on cart icon on the top")
	public void user_clicks_on_cart_icon_on_the_top() throws InterruptedException {
		homePage.clickOnCartIconOnTop();
		Thread.sleep(2000);
	}

	@Then("the added product should be visible in the cart")
	public void the_added_product_should_be_visible_in_the_cart() {
//		Assert.assertEquals(TestDataHandler.readProperty("productToBeSelected"),
//				homePage.getProductNameVisibleUnderCart());
		org.junit.Assert.assertEquals(TestDataHandler.readProperty("productToBeSelected"),
				homePage.getProductNameVisibleUnderCart());
	}

}
