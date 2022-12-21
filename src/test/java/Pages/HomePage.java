package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    By SIGNINLOGINBUTTON = By.xpath("//*[@href='/login']");
    By HOME_TITLE = By.xpath("(//a[@href='/'])[2]");
    By LOGOUT =By.xpath("//i[@class='fa fa-lock']");
    public String  checkHomeTitle(){
        return driver.findElement(HOME_TITLE).getText();

    }
    public void clickOnSignInLogin(){
        driver.findElement(SIGNINLOGINBUTTON).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SIGNINLOGINBUTTON));
    }
    public void clickLogOut(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(LOGOUT));
        driver.findElement(LOGOUT).click();
    }
}
