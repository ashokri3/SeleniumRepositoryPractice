//package tests;
//
//import base.BaseTest;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.FileNotFoundException;
//
//public class LoginPageTest extends BaseTest {
//
//    //Title of Page (assertrequals ("Actual","Expected")
//    //Login using Username and Password
//    //Verify successful login
//
//    @Test
//    public void verifyLoginPageTitle() throws FileNotFoundException {
//        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//    }
//
//    @Test
//    public void enterCredentials() throws FileNotFoundException, InterruptedException {
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//    }
//
//    @Test
//    public void loginSuccessfully() throws InterruptedException, FileNotFoundException {
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//    }
//
//
//
//}
