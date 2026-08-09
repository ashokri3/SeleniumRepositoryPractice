







package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    protected WebDriver driver;
    protected WebDriverWait wait;

    //Constructor:
    public WaitUtils(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    /*listofutilsrequired:
    1. wait until element is visible
    2. wait until element is clickable
    3. click
    4. type text
    5. read text
    6. wait until element is invisible
     */

    //wait until element is visible
    public WebElement waitForVisibility(By locator){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //wait until element is clickable
    public WebElement waitForClick(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    //click:
    public void click(By locator){
        waitForClick(locator).click();
    }

    //type text
    public void type(By locator, String text){
        waitForVisibility(locator).clear();
        waitForVisibility(locator).sendKeys(text);
    }

    //Read text:
    public String getText(By locator){
        return waitForVisibility(locator).getText();
    }

    //Wait until element disappears
    public boolean waitForInvisibility(By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }



}













//package utils;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class WaitUtils {
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//
//    //Constructor:
//    public WaitUtils(WebDriver driver){
//        this.driver=driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//    }
//
//    /*listofutilsrequired:
//    1. wait until element is visible
//    2. wait until element is clickable
//    3. click
//    4. type text
//    5. read text
//    6. wait until element is invisible
//     */
//
//    //wait until element is visible
//    public WebElement waitForVisibility(By locator){
//        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
//    //wait until element is clickable
//    public WebElement waitForClick(By locator){
//        return wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }
//
//    //click:
//    public void click(By locator){
//        waitForClick(locator).click();
//    }
//
//    //type text
//    public void type(By locator, String text){
//        waitForVisibility(locator).clear();
//        waitForVisibility(locator).sendKeys(text);
//    }
//
//    //Read text:
//    public String getText(By locator){
//        return waitForVisibility(locator).getText();
//    }
//
//    //Wait until element disappears
//    public boolean waitForInvisibility(By locator){
//        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
//    }
//
//
//
//}
