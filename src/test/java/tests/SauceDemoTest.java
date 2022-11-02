package tests;

import org.testng.annotations.Test;
import pages.CartPage;


public class SauceDemoTest extends BaseTest {




    @Test(invocationCount = 5)
    public Void loginTest() {
        loginPage.openPage();
        loginPage.login(userName:"standard_user", password:"secret_sauce");
        productsPage.addToCart(productName:"Sauce Labs Fleece Jacket");
        CartPage.openPage();
        CartPage.validateNumberOfProducts(1);
        CartPage.validateProductDetails(productName:"Sauce Labs Fleece Jacket", quantity:1, price:9.99);
    }
    @Test
    public void openProductPage(){
        loginPage.openPage();
        loginPage.login( userName:"standard_user", password:"secret_sauce");
        productsPage.openPage();
    }

    }
}
