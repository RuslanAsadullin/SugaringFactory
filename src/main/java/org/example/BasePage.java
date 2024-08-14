package org.example;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private final WebDriver driver;
//ghg
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}