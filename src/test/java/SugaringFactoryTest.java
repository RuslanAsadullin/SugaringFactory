import org.example.HomePage;
import org.example.ProductPage;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SugaringFactoryTest extends BaseTest {

    @Test
    public void testing() {
        HomePage homePage = new HomePage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        getDriver().get("https://sugaringfactory.com/");
        homePage.clickOnProduct();
        productPage.clickAddToCart();
        assertEquals("1", productPage.getCartItemCount());
    }
}