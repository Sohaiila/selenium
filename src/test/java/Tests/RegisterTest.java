package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUPInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class RegisterTest {

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
    //1
   @Test
    public void signUP() {
       SoftAssert softAssert = new SoftAssert();
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);
       signUPInfoPage = new SignUPInfoPage(driver);
       softAssert.assertEquals(homePage.checkHomeTitle(),"Home","Home title is not matched");
       homePage.clickOnSignInLogin();
       softAssert.assertEquals(loginPage.checkSignUpTitle(),"New User Signup!","Title is not matched");
       loginPage.enterUserName("Sohaila");
       loginPage.enterEmail("sohaiilazizz@gmail.com");
       loginPage.clickSignUp();
       softAssert.assertEquals(signUPInfoPage.AccInfoTitle(),"ENTER ACCOUNT INFORMATION","Title is not matched");
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
       softAssert.assertEquals(signUPInfoPage.checkAccountCREATED(),"ACCOUNT CREATED!","Title is not matched");
       signUPInfoPage.clickContain();
       softAssert.assertEquals(signUPInfoPage.checkLogedByUser(),"Logged in as Sohaila","Title is not matched");
       signUPInfoPage.clickDelete();
       softAssert.assertEquals(signUPInfoPage.checkAccountDELETED(),"ACCOUNT DELETED!","Title is not matched");
       signUPInfoPage.clickContain();
       softAssert.assertAll();

   }
   //5  m7taga ahandel 7war l new user daa!!
 @Test
    public void signUpWithUsedEmail(){
       SoftAssert softAssert = new SoftAssert();
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);
       signUPInfoPage = new SignUPInfoPage(driver);
       softAssert.assertEquals(homePage.checkHomeTitle(),"Home","Home title is not matched");
       homePage.clickOnSignInLogin();
       softAssert.assertEquals(loginPage.checkSignUpTitle(),"New User Signup!","Title is not matched");
       loginPage.enterUserName("Sohaila");
       loginPage.enterEmail("sohailaabdelaziiiz@gmail.com");
       loginPage.clickSignUp();
       //Verify error 'Email Address already exist!' is visible


     }




}



