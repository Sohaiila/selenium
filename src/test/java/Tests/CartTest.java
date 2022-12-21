package Tests;

import Pages.CartPage;
import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest {
    WebDriver driver;
    String URL = "https://automationexercise.com/";

    ProductPage productPage;
    CartPage cartPage;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
     }
//12
   @Test
    public void addElementsToCart(){
       SoftAssert softAssert = new SoftAssert();
       productPage= new ProductPage(driver);
       cartPage = new CartPage(driver);
       productPage.clickProductButton();
       productPage.hoveroverFirst();
       productPage.addFirstItemToCart();
       productPage.clickContain();
       productPage.hoveroverSecond();
       productPage.addSecondToCart();
       productPage.viewCart();
       softAssert.assertTrue(cartPage.checkFirstItemAdded().contains("Blue"));
       softAssert.assertTrue(cartPage.checkSecondItemAdded().contains("Men"));
       softAssert.assertTrue(cartPage.checkFirstItemPrice().contains("500"));
       softAssert.assertEquals(cartPage.checkFirstItemQuantity(),"1");
       softAssert.assertTrue(cartPage.checkFirstItemTotal().contains("500"),"not matched");
       softAssert.assertTrue(cartPage.checkSecondItemPrice().contains("400"));
       softAssert.assertEquals(cartPage.checkSecondItemQuantity(),"1");
       softAssert.assertTrue(cartPage.checkSecondItemTotal().contains("400"),"not matched");
       softAssert.assertAll();

    }


@AfterClass
    public void close(){
    driver.quit();
}





}