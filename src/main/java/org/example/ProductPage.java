package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    private final By addToCartButtonLocator = By.xpath("//input[@id='button-cart']");
    private final By cartItemCountLocator = By.xpath("//span[@class='cart-item-count']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickAddToCart() {
        getWait5().until(ExpectedConditions.visibilityOfElementLocated(addToCartButtonLocator)).click();
        return this;
    }

    public String getCartItemCount() {
        return getWait5().until(ExpectedConditions.visibilityOfElementLocated(cartItemCountLocator))
                .getText();
    }
}