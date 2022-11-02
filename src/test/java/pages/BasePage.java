package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    WebDriver wait;


    public BasePage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(this.driver, timeOutlnSeconds:10);

    }
    public void waitForNumberoOfElements(By locator, int numberOfElements){
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(locator, numberOfElements));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
            Assert.fail("Количество элементов на странице не соответствует ожидаемому числу:" + numberOfElements);
        }
        }

    }

}
