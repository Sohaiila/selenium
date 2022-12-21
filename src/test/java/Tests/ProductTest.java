package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SignUPInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductTest {
    LoginPage loginPage;
    HomePage homePage;
    SignUPInfoPage signUPInfoPage;
    ProductPage productPage;
    WebDriver driver;
    String URL = "https://automationexercise.com/";

@BeforeClass
  public void setUp() {

        driver = new ChromeDriver();
        driver.get(URL);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);

  }

//9
@Test
    public void searchProduct(){
    SoftAssert softAssert = new SoftAssert();
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    signUPInfoPage = new SignUPInfoPage(driver);
    productPage = new ProductPage(driver);
    softAssert.assertEquals(homePage.checkHomeTitle(),"Home","Home title is not matched");
    productPage.clickProductButton();
    softAssert.assertEquals(productPage.checkAllProductTitle(),"ALL PRODUCTS","Title is not matched");
    productPage.clickSearchBar();
    productPage.enterProductName("Tshirt");
    productPage.clickSearchButton();
    softAssert.assertEquals(productPage.checkSearchedTitle(),"SEARCHED PRODUCTS","Title is not matched");
    softAssert.assertAll();
}

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }

}
