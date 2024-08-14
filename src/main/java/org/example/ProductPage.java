package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage extends BasePage {

    private final WebDriverWait wait;

    private final By addToCartButtonLocator = By.xpath("//input[@id='button-cart']");
    private final By cartItemCountLocator = By.xpath("//span[@class='cart-item-count']");

    public ProductPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public void clickAddToCart() {
        getDriver().findElement(addToCartButtonLocator).click();
    }

    public String getCartItemCount() {
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(cartItemCountLocator));
        return cart.getText();
    }
}