package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By productInfo = By.className("product-grid-item__info");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnProduct() {
        driver.findElement(productInfo).click();
    }
}
