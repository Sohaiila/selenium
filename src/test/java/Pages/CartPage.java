package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    By FIRSTITEM= By.partialLinkText("Blue");
    By SECONDITEM =By.partialLinkText("Men");
    /* Price Quantity total of first item */
    By PRICE1 = By.xpath("(//td[@class='cart_price'])[1]");
    By QUANTITY1 =By.xpath("(//td[@class='cart_quantity'])[1]");
    By TOTAL1 = By.xpath("(//p[@class='cart_total_price'])[1]");
    /* Price Quantity total of second item */
    By PRICE2 = By.xpath("(//td[@class='cart_price'])[2]");
    By QUANTITY2 =By.xpath("(//td[@class='cart_quantity'])[2]");
    By TOTAL2 = By.xpath("(//p[@class='cart_total_price'])[2]");
    public String checkFirstItemAdded(){
        return driver.findElement(FIRSTITEM).getText();
    }
    public String checkSecondItemAdded(){
        return driver.findElement(SECONDITEM).getText();
    }
   public String checkFirstItemPrice(){
        return driver.findElement(PRICE1).getText();
   }
    public String checkFirstItemQuantity(){
        return driver.findElement(QUANTITY1).getText();
    }
    public String checkFirstItemTotal(){
        return driver.findElement(TOTAL1).getText();
    }

    public String checkSecondItemPrice(){
        return driver.findElement(PRICE2).getText();
    }
    public String checkSecondItemQuantity(){
        return driver.findElement(QUANTITY2).getText();
    }
    public String checkSecondItemTotal(){
        return driver.findElement(TOTAL2).getText();
    }
}
