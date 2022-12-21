package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUPInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LogOutTest {



    LoginPage loginPage;
    HomePage homePage;
    SignUPInfoPage signUPInfoPage;
    WebDriver driver;
    String URL = "https://automationexercise.com/";

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.get(URL);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);


    }

    @BeforeMethod
    public void enternewemail(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        signUPInfoPage = new SignUPInfoPage(driver);
        homePage.clickOnSignInLogin();
        loginPage.enterUserName("Sohaila");
        loginPage.enterEmail("Sohailalllolo@gmail.com");
        loginPage.clickSignUp();
        signUPInfoPage.clickGender1Title();
        signUPInfoPage.enterPassword("sohaiilllaa");
        signUPInfoPage.enterDays("1");
        signUPInfoPage.enterMonth("May");
        signUPInfoPage.enterYears("1999");
        signUPInfoPage.clickNewSletter();
        signUPInfoPage.clickOption();
        signUPInfoPage.enterFirstName("Sohaila");
        signUPInfoPage.enterLastName("Abdelaziz");
        signUPInfoPage.enterCompany("Voda");
        signUPInfoPage.enterAddress1("Haleem Basha");
        signUPInfoPage.enterAddress2("Shubra Masr");
        signUPInfoPage.clickCountry("Canada");
        signUPInfoPage.enterCity("jsh");
        signUPInfoPage.enterState("Cairo");
        signUPInfoPage.enterZipCode("14150");
        signUPInfoPage.enterNumber("15161944");
        signUPInfoPage.clickCreateButton();
        signUPInfoPage.clickContain();
        homePage.clickLogOut();

    }



    @Test
    public void logOut(){
        SoftAssert softAssert = new SoftAssert();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        signUPInfoPage = new SignUPInfoPage(driver);
        softAssert.assertEquals(homePage.checkHomeTitle(), "Home", "Home title is not matched");
        homePage.clickOnSignInLogin();
        softAssert.assertEquals(loginPage.checkLogInTitle(), "Login to your account", "Title is not matched");
        //Valid data with already regestered user
        loginPage.enterLoginEmail("Sohailalllolo@gmail.com");
        loginPage.enterLoginPass("sohaiilllaa");
        loginPage.clickLogIn();
        softAssert.assertEquals(signUPInfoPage.checkLogedByUser(),"Logged in as Sohaila","Title is not matched");
        homePage.clickLogOut();
        softAssert.assertAll();

    }
   @AfterMethod
    public void deleteAccount(){
        homePage.clickOnSignInLogin();
        loginPage.enterLoginEmail("Sohailalllolo@gmail.com");
        loginPage.enterLoginPass("sohaiilllaa");
        loginPage.clickLogIn();
        signUPInfoPage.clickDelete();

   }
    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
