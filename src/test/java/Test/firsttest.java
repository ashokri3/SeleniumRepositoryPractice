package Test;

import Base.Commonsetup;
import Pages.Login;
import Utils.ScreenshotUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class firsttest extends Commonsetup
{
    @Test(priority = 1)
 public void onetitle()
 {
 Login log=new Login(driver);
 log.enterusername("Admin");
 log.enterpassword("admin123");
 log.clicksubmit();
 log.equals();
 }
 @Test(priority=2)
 public void twoverifylogin()
 {
     Login l=new Login(driver);
     l.enterusername("Admin");
     l.enterpassword("admin123");
     l.clicksubmit();
     l.equals();
     ScreenshotUtility.captureScreenshot(driver, "firsttest");
     /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
     ele.sendKeys("Admin");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[text()=' Login ']")).click();*/
     //Assert.assertEquals(driver.getTitle(),"OrangeHRM");

 }
}
