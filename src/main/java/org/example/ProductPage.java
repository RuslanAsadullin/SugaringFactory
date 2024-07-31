package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    private By addToCartButton = By.xpath("//input[@id='button-cart']");
    private By cartItemCount = By.xpath("//span[@class='cart-item-count']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
    public String getCartItemCount() {
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(cartItemCount));
        return cart.getText();
    }
}
