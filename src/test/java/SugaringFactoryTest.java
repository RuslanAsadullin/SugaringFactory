import org.example.HomePage;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SugaringFactoryTest extends BaseTest {

    @Test
    public void testing() {
        getDriver().get("https://sugaringfactory.com/");
        String number = new HomePage(getDriver())
                .clickOnProduct()
                .clickAddToCart()
                .getCartItemCount();
        assertEquals("1", number);
    }
}