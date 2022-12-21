package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
        WebDriver driver;
        WebDriverWait webDriverWait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

   // By SIGNINLOGINBUTTON = By.xpath("//*[@href='/login']");
    By SIGNUPTITLE = By.xpath("//div[@class='signup-form']//h2");
    By LOGINFORMTITLE = By.xpath("//div[@class='login-form']//h2");
    //String URL="https://automationexercise.com/";

    By LOGINEMAIL = By.xpath("//*[@data-qa='login-email']");
    By LOGINPASS = By.xpath("//*[@data-qa='login-password']");
    By LOGINBUTTON = By.xpath("//*[@data-qa='login-button']");
    //SIGN UP VARIABLES
    By SIGNUPNAME = By.xpath("//*[@data-qa='signup-name']");
    By SIGNUPEMAIL = By.xpath("//*[@data-qa='signup-email']");
    By SIGNUPBUTTON = By.xpath("//*[@data-qa='signup-button']");
    By INCORRECTEMAILANDPASS= By.xpath("//p[@style='color: red;']");

    public String checkSignUpTitle(){
        return driver.findElement(SIGNUPTITLE).getText();
    }
    public String checkLogInTitle(){
        return driver.findElement(LOGINFORMTITLE).getText();
    }
   public void enterUserName(String username){
        driver.findElement(SIGNUPNAME).sendKeys(username);
   }
   public void enterEmail(String email){
        driver.findElement(SIGNUPEMAIL).sendKeys(email);
   }
  public void clickSignUp(){
   driver.findElement(SIGNUPBUTTON).click();
   //webDriverWait.until(ExpectedConditions.elementToBeClickable(SIGNUPBUTTON));
  }
    public void enterLoginEmail(String loginmail){
        driver.findElement(LOGINEMAIL).sendKeys(loginmail);
    }
    public void enterLoginPass(String loginpass){
        driver.findElement(LOGINPASS).sendKeys(loginpass);
    }
    public void clickLogIn(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SIGNUPBUTTON));
        driver.findElement(LOGINBUTTON).click();

    }
    public String  checkErrorMessIncorrectLogin(){
        return driver.findElement(INCORRECTEMAILANDPASS).getText();
    }

}
