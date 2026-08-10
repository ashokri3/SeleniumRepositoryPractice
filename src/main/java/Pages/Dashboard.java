package Pages;

import Config.ConfigReader;
import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard
{
 WebDriver driver;
 commonutils cu;

By pim= By.xpath("//span[text()='PIM']");
By emplist=By.xpath("//a[text()='Employee List']");
By add=By.xpath("//div[@class='orangehrm-header-container']//button//i");
By firstname=By.xpath("//input[@name='firstName']");
By lastname=By.xpath("//input[@name='lastName']");
By savebutton=By.xpath("//button[text()=' Save ']");
By report=By.xpath("//a[text()='Reports']");
By recordreport=By.xpath("//div[@class='oxd-table-body']");
By listrecordreport=By.xpath("//div[@class='oxd-table-body']/div");
By buttonlist=By.tagName("button");

    public Dashboard(WebDriver driver)
    {
        this.driver=driver;
     this.cu=new commonutils(driver);
    }
 public void pim()

 {
 cu.clicking(pim);
 }
 public void emplist()
 {
 cu.clicking(emplist);
 }
 public void clickadd()
 {
  cu.clicking(add);
 }
 public void firstname()
 {
  cu.sendkeys(firstname,"Prakash");
 }
 public void lastname()
 {
 cu.sendkeys(lastname,"A");
 }
 public void savebutton()
 {
  cu.clicking(savebutton);
 }
 public void report()
 {
  cu.clicking(report);
 }
 public void recordreport()
 {
  cu.clicking(recordreport);
 }
 public void listelement()
{
 cu.listelement(listrecordreport,"Employee Contact info report",buttonlist);
}
}
