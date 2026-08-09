package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;

public class ManageEmployee extends BaseTest {

    @Test
    public void addEmployee() throws InterruptedException {

        // Create page objects
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);

        // Login
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        // Verify login was successful
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());

        // Navigate to PIM
        dashboardPage.clickPIM();

        // Click Add Employee
        dashboardPage.clickAddEmployee();

        // Enter employee details
        addEmployeePage.enterFirstName("Arnold");
        addEmployeePage.enterLastName("Wan");

        // Ajax loader
        addEmployeePage.waitForLoaderToDisappear();

        // Save
        addEmployeePage.clickSave();
    }
}



//Cucumber BDD
//GitHub







//package tests;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import utils.WaitUtils;
//
//
//public class ManageEmployee {
//
//    @Test
//    public void addEmployee() throws InterruptedException {
//
//        WaitUtils wait = new WaitUtils(driver);
//
//        //Login
//        wait.type(By.cssSelector("input[placeholder='Username']"), "Admin");
//        wait.type(By.name("password"),"admin123");
//        wait.click(By.cssSelector("button[type='submit']"));
//
//        //Verify login was successful:
//        wait.waitForVisibility(By.xpath("//h6[text()='Dashboard']"));
//
//       // Assert.assertTrue(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
//
//        //Navigate to Pim
//        wait.click(By.xpath("//span[text()='PIM']"));
//
//        //Click on add employee:
//        wait.click(By.xpath("//a[text()='Add Employee']"));
//
//        //Enter employee details:
//        wait.type(By.name("firstName"), "Arnold");
//        wait.type(By.name("lastName"), "Wan");
//
//        //Ajax loader:
//        wait.waitForInvisibility(By.cssSelector(".oxd-form-loader"));
//
//        //Submit:
//        wait.click(By.cssSelector("button[type='submit']"));
//
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']"))).sendKeys("Admin");
//
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//
//        //Verify login was successful -
//        //Dashboard verification
//        WebElement dashboardHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
//        Assert.assertTrue(dashboardHeading.isDisplayed());
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("Arnold");
//        driver.findElement(By.name("lastName")).sendKeys("Wan");
//
//        //Ajax loader issue:
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".oxd-form-loader")));
//
//        //Submit button:
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
//    }
//}


//POM - PageObjectModel:

//create a separate java class for each and every page of the application



























//package tests;
//
//import base.BaseTest;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.AddEmployeePage;
//import pages.DashboardPage;
//import pages.LoginPage;
//
//public class ManageEmployee extends BaseTest {
//
//    @Test
//    public void addEmployee() throws InterruptedException {
//
//        // Create page objects
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
//
//        // Login
//        loginPage.enterUsername("Admin");
//        loginPage.enterPassword("admin123");
//        loginPage.clickLogin();
//
//        // Verify login was successful
//        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
//
//        // Navigate to PIM
//        dashboardPage.clickPIM();
//
//        // Click Add Employee
//        dashboardPage.clickAddEmployee();
//
//        // Enter employee details
//        addEmployeePage.enterFirstName("Arnold");
//        addEmployeePage.enterLastName("Wan");
//
//        // Ajax loader
//        addEmployeePage.waitForLoaderToDisappear();
//
//        // Save
//        addEmployeePage.clickSave();
//    }
//}
//
//
//
//


////
////    /*
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']"))).sendKeys("Admin");
////        //driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
////        driver.findElement(By.name("password")).sendKeys("admin123");
////        driver.findElement(By.cssSelector("button[type='submit']")).click();
////        // Thread.sleep(3000);
////
////        //Verify login was successful
////        //Dashboard verification:
////        WebElement dashboardHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
////        Assert.assertTrue(dashboardHeading.isDisplayed());
////
////        //Click on Pim
////        // driver.findElement(By.xpath("//span[text()='PIM']")).click();
////
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
////
////        //Thread.sleep(3000);
////
////        //CLick on Add Employee:
////        // driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
////
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();
////
////        // Thread.sleep(3000);
////        //Enter employee
////
////        //driver.findElement(By.name("firstName")).sendKeys("Arnold");
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("Arnold");
////        driver.findElement(By.name("lastName")).sendKeys("Wan");
////
////        //Ajax loader issue:
////        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".oxd-form-loader")));
////
////        //Click on Save:
////        // driver.findElement(By.cssSelector("button[type='submit']")).click();
////        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
////        //Capture Success message:
////
////        //WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Successfully')]));
////        //Assert.assertTrue(driver.findElement(By.xpath("//p[text()='SuccessfullySaved')]")).isDisplayed());
////        //Assert.assertTrue(successMessage.isDisplayed());
////
////        //Thread.sleep(2000);
////
////        // System.out.println(driver.getPageSource().contains("Successfully"));
////        // WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Successfully')]")));
////        // System.out.println(driver.getPageSource().contains("Successfully"));
////
////        //Ajax loader issue:
////        //oxd-form -> oxd-form-loader
////        //css selector:
////        //attribute - tag - By.css("button") - CSS Selector class (.oxd-form-loader)
////        //Explicit wait:
////        //payment 5 seconds - thread sleep 10
////        //wait for payment to be credited
////        //max timeout 15 seconds
////        //Ajax loader:
////
//// }
//// }
////         */
////
////
