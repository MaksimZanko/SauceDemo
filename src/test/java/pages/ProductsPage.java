package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage{
    private  String ADD_TO_CART_LOCATOR = "//*[text()='%s']/../../..//button";
    private  static final String ADD_TO_CART_CSS = ".btn_inventory";
    private static final String LOGIN_URL = "https://www.saucedemo.com/";

    public ProductsPage(WebDriver driver){
       super(driver);
    }

    public void openPage () {

        driver.get("LOGIN_URL");
        waitForNumberOfElemenets(By.cssSelector(ADD_TO_CART_CSS), number:6);

    }
    public  void addToCart(String productName){
        waitForNumberOfElemenets(By.cssSelector(ADD_TO_CART_CSS), number:6);
        By addToCartXpath =  By.xpath(String.format(ADD_TO_CART_LOCATOR,productName));
        driver.findElement(addToCartXpath).click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(ADD_TO_CART_CSS), number:6));
    }
}
