package Test;

import Base.Commonsetup;
import Config.ConfigReader;
import Pages.Dashboard;
import Pages.Login;
import Utils.ScreenshotUtility;
import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
public class pim extends Commonsetup {
 //ConfigReader config = new ConfigReader();
 @Test
 public void clickpim() {


  Login log=new Login(driver);
  log.enterusername("Admin");
  log.enterpassword("admin123");
  log.clicksubmit();
  Dashboard db = new Dashboard(driver);
  db.pim();
  db.emplist();
  db.clickadd();
  db.firstname();
  db.lastname();
  db.savebutton();
  db.report();
  db.recordreport();
  db.listelement();
  ScreenshotUtility.captureScreenshot(driver, "pim");
  /*cu.clicking(By.xpath("//span[text()='PIM']"));
  cu.clicking(By.xpath("//a[text()='Employee List']"));
  cu.clicking(By.xpath("//div[@class='orangehrm-header-container']//button//i"));
  cu.sendkeys(By.xpath("//input[@name='firstName']"),"Prakash");
  cu.sendkeys(By.xpath("//input[@name='lastName']"), "A");
  cu.clicking(By.xpath("//button[text()=' Save ']"));
  cu.clicking(By.xpath("//a[text()='Reports']"));
  cu.visibleelement(By.xpath("//div[@class='oxd-table-body']"));
  List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
  System.out.println("SIZE" + rows.size());
  for (WebElement row : rows) {
   System.out.println(row.getText());
   if (row.getText().contains("Employee Contact info report")) {
    List<WebElement> buttons = row.findElements(By.tagName("button"));

    System.out.println("Buttons = " + buttons.size());

    buttons.get(2).click();
    break;
   }
  }
 }*/
 }
}