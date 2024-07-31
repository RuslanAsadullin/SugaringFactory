import org.example.HomePage;
import org.example.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.testng.AssertJUnit.assertEquals;

public class SugaringFactoryTest {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void testing() {
        driver.get("https://sugaringfactory.com/");
        homePage.clickOnProduct();
        productPage.clickAddToCart();
        assertEquals("1", productPage.getCartItemCount());
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
