package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static java.sql.DriverManager.getDriver;

public class HomePage extends BasePage {

    private final By productInfoLocator = By.className("product-grid-item__info");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProduct() {
        try {
            getDriver().findElement(productInfoLocator).click();
        } catch (NoSuchElementException e) {
            System.out.println("Product element not found: " + e.getMessage());
        }
    }
}