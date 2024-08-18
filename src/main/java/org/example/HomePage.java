package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By productInfoLocator = By.className("product-grid-item__info");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickOnProduct() {
        try {
            getDriver().findElement(productInfoLocator).click();
        } catch (NoSuchElementException e) {
            System.out.println("Product element not found: " + e.getMessage());
        }
        return new ProductPage(getDriver());
    }
}