package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait webDriverWait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        //webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    By PRODUCTSBUTTON= By.xpath("//i[@class='material-icons card_travel']" );
    By ALLPRODUCTTITLE =By.xpath("//h2[@class='title text-center']");
    By PRODUCTITLE = By.xpath("//a[@href='/products']");
    By SEARCHBUTTON = By.id("submit_search");
    By SEARCHBAR = By.id("search_product");
    By SEARCHEDTITLE =By.xpath("//h2[@class='title text-center']");
    By FIRSTELEMENT = By.xpath("((//div[@class='productinfo text-center'])[1])");
    By SECONDELEMENT =By.xpath("((//div[@class='productinfo text-center'])[2])");
    By ADDTOCART1 = By.xpath("(//a[@data-product-id='1'])[1]");
    By ADDTOCART2 = By.xpath("(//a[@data-product-id='2'])[1]");
    By COUNTAIN = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    By VIEWCART = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");




    public void clickProductButton (){
        driver.findElement(PRODUCTSBUTTON).click();
    }
    public String checkProductTitle (){
        return driver.findElement(PRODUCTITLE).getText();
    }
    public void clickSearchBar(){

        driver.findElement(SEARCHBAR).click();
        //webDriverWait.until(ExpectedConditions.elementToBeClickable(SEARCHBUTTON));

    }

    public void enterProductName(String product){
        driver.findElement(SEARCHBAR).sendKeys(product);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(SEARCHBUTTON).click();



    }
    public void clickSearchButton(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SEARCHBUTTON));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(SEARCHBUTTON);
    }
    public String checkAllProductTitle (){
        return driver.findElement(ALLPRODUCTTITLE).getText();
    }
    public String checkSearchedTitle(){
        return driver.findElement(SEARCHEDTITLE).getText();
    }


    public void hoveroverFirst(){
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(FIRSTELEMENT)).perform();

    }
    public void hoveroverSecond(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(SECONDELEMENT)).perform();

    }
  public void addFirstItemToCart(){
        driver.findElement(ADDTOCART1).click();
      webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
  }

 public void clickContain(){
     webDriverWait.until(ExpectedConditions.elementToBeClickable(COUNTAIN));
        driver.findElement(COUNTAIN).click();
     webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
 }

    public void addSecondToCart(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ADDTOCART2));
        driver.findElement(ADDTOCART2).click();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
   public void viewCart(){
       webDriverWait.until(ExpectedConditions.elementToBeClickable(VIEWCART));
       driver.findElement(VIEWCART).click();
       webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
   }


}
