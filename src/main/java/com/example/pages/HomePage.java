package com.example.pages;

import com.example.utils.Helper;
import com.example.utils.LocatorUtil;
import com.example.utils.TestDataHandler;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    Map<String, Map<String, String>> locators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.locators = LocatorUtil.loadLocators("locators/HomePageLocators.yaml");
    }
    
    private WebElement element(String locatorName) {
		return driver.findElement(LocatorUtil.getLocator(locators, locatorName));
    }

	public void clickOnaddtoCartButton() {
		WebElement productToBeSelected = element("productToBeSelected");
		Helper.waitForElementVisibility(driver, productToBeSelected, 10);
		TestDataHandler.writeToFile("productToBeSelected", productToBeSelected.getText());
		element("addToCartButton").click();
	}

	public void clickOnCartIconOnTop() {
		element("cartIconOnTheTop").click();
	}

	public String getProductNameVisibleUnderCart() {
		return element("productNameVisibleUnderCart").getText();
	}
}