import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class SugaringFactoryTest {
        WebDriver driver;

        @BeforeEach
        public void setup() {
            driver = new ChromeDriver();
        }

        @Test
        public void testing() {
            driver.get("https://test.sugaringfactory.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement checkProduct = driver.findElement(By.className("product-grid-item__info"));
            checkProduct.click();
            WebElement AddToCart = driver.findElement(By.xpath("//input[@id='button-cart']"));
            AddToCart.click();
            WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='cart-item-count']")));
            assertEquals(cart.getText(),"1");
            driver.quit();
        }
    }
