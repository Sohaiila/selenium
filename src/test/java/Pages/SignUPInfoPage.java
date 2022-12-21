package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUPInfoPage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Select select;
    Select select1;
    Select select2;
    Select select3;

    public SignUPInfoPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
   //varifyTitlelocator
    By ENTERACCINFOTITLE = By.xpath("(//div[@class='login-form']//h2)[1]");
    //enteraccount info
    By GENDERMale = By.id("id_gender1");
    By GENDERFemale = By.id("id_gender2");
    By DAYS = By.id("days");
    By MONTH = By.id("months");
    By YEARS = By.id("years");
    By NEWSLETTER = By.id("newsletter");
    By OPTION = By.id("optin");
    By PASSWORD = By.id("password");
    //Address info variables
    By FIRSTNAME = By.id("first_name");
    By LASTNAME = By.id("last_name");
    By COPMPANY = By.id("company");
    By ADDRESS1 = By.id("address1");
    By ADDRESS2 = By.id("address2");
    By COUNTRY = By.id("country");
    By STATE = By.id("state");
    By CITY = By.id("city");
    By ZIPCODE = By.id("zipcode");
    By NUMBER = By.id("mobile_number");
    By CREATEACCOUNT = By.xpath("//*[@data-qa='create-account']");
    By CONTAIN = By.xpath("//*[@data-qa='continue-button']");
    By DELETE = By.xpath("//i[@class='fa fa-trash-o']");
    By ACCOUNTCREATEDTITLE =By.xpath("//*[@data-qa='account-created']");
    By LOGEDASUSERNAME =By.xpath("//i[contains(@class,'fa-user')]//parent::a");
    By ACCOUNTDELETEDTITLE = By.xpath("//*[@data-qa='account-deleted']");
    public String AccInfoTitle() {
        return driver.findElement(ENTERACCINFOTITLE).getText();
    }
    public void clickGender1Title(){
       // webDriverWait.until(ExpectedConditions.elementToBeClickable(GENDERFemale));
         driver.findElement(GENDERFemale).click();

    }

   public void enterPassword(String pass){
     driver.findElement(PASSWORD).sendKeys(pass);

   }

   public void enterDays(String days ){
       webDriverWait.until(ExpectedConditions.elementToBeClickable(DAYS));
       select= new Select(driver.findElement(DAYS));
       select.selectByVisibleText(days);

   }
   public void enterMonth(String  month){
       webDriverWait.until(ExpectedConditions.elementToBeClickable(MONTH));
       select1= new Select(driver.findElement(MONTH));
       select1.selectByVisibleText(month);
 }
   public void enterYears(String years){
       webDriverWait.until(ExpectedConditions.elementToBeClickable(YEARS));
       select2= new Select(driver.findElement(YEARS));
       select2.selectByVisibleText(years);
 }
   public void clickNewSletter(){
     driver.findElement(NEWSLETTER).click();
       webDriverWait.until(ExpectedConditions.elementToBeClickable(NEWSLETTER));
   }
   public void clickOption(){
     driver.findElement(OPTION).click();
       webDriverWait.until(ExpectedConditions.elementToBeClickable(OPTION));
   }

   public void enterFirstName(String firstname){
     driver.findElement(FIRSTNAME).sendKeys(firstname);
   }
  public void enterLastName(String lastname){
    driver.findElement(LASTNAME).sendKeys(lastname);
 }
 public void enterCompany(String company){
  driver.findElement(COPMPANY).sendKeys(company);
 }

 public void enterAddress1(String address1){
  driver.findElement(ADDRESS1).sendKeys(address1);
 }
 public void enterAddress2(String address2){
  driver.findElement(ADDRESS2).sendKeys(address2);
 }
 public void clickCountry(String country){
     webDriverWait.until(ExpectedConditions.elementToBeClickable(COUNTRY));
     select3= new Select(driver.findElement(COUNTRY));
     select3.selectByVisibleText(country);
 }
 public void enterState(String state){
  driver.findElement(STATE).sendKeys(state);
 }
 public void enterCity(String city){
  driver.findElement(CITY).sendKeys(city);
 }

 public void enterZipCode(String zipcode){
  driver.findElement(ZIPCODE).sendKeys(zipcode);
 }

  public void enterNumber(String yournumber){
     driver.findElement(NUMBER).sendKeys(yournumber);
  }
  public void clickCreateButton(){
      //webDriverWait.until(ExpectedConditions.elementToBeClickable(CREATEACCOUNT));
      driver.findElement(CREATEACCOUNT).click();

  }
  public void clickContain(){
      webDriverWait.until(ExpectedConditions.elementToBeClickable(CONTAIN));
        driver.findElement(CONTAIN).click();
  }
    public void clickDelete(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(DELETE));
        driver.findElement(DELETE).click();
    }
    public String  checkAccountCREATED(){
        return driver.findElement(ACCOUNTCREATEDTITLE).getText();
    }
    public String  checkAccountDELETED(){
        return driver.findElement(ACCOUNTDELETEDTITLE).getText();
    }
    public String  checkLogedByUser(){
        return driver.findElement(LOGEDASUSERNAME).getText();
    }


}
