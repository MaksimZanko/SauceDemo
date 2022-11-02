package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage{
    private static final By CART_ITEM = By.cssSelector(".cart_item");
    private static final String URL = "https://www.saucedemo.com/cart.html";
    public CartPage(WebDriver driver){
        super(driver);
    }
    public void  openPage() {driver.get(URL);}
    public  void  validateNumberOfProducts(int  number){

        Assert.assertEquals(driver.findElements(CART_ITEM).size(),number,
                message:"количество элементов в корзине неверное");

    }
    public void validateProductdetails(){

    }
}
