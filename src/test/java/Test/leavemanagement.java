package Test;

import Base.Commonsetup;
import Config.ConfigReader;
import Pages.Login;
import Pages.leavestatus;
import Utils.ScreenshotUtility;
import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class leavemanagement extends Commonsetup {

    @Test
    public void applying()
    {
        Login log=new Login(driver);
        log.enterusername("Admin");
        log.enterpassword("admin123");
        log.clicksubmit();
        leavestatus ls=new leavestatus(driver);
        ls.leave();
        ls.Myleave();
        ls.fromdate();
        ScreenshotUtility.captureScreenshot(driver, "fromdate");
        ls.todate();
        ScreenshotUtility.captureScreenshot(driver, "todate");
        ls.clearvalue();
        ls.Leavestatusdropdown();
        ls.Pendingapproval();
        ls.Leavetypedropdown();
        ls.usapproval();
        ls.search();
        ScreenshotUtility.captureScreenshot(driver, "leavemanagement");
        /*cu.clicking(By.xpath("//span[text()='Leave']"));
        cu.clicking(By.xpath("//a[text()='My Leave']"));
        cu.sending(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"),"2026-03-04");
        cu.sending(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"),"2026-08-01");

        while (true) {
            List<WebElement> clearIcons = driver.findElements(
                    By.xpath("//i[contains(@class,'bi-x') and contains(@class,'--clear')]"));

            if (!clearIcons.isEmpty())
                clearIcons.get(0).click();
            break;
        }
        cu.clicking(By.xpath("//div[text()='Select']"));
        cu.clicking(By.xpath("//span[normalize-space()='Pending Approval']"));
        cu.clicking(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
        cu.clicking(By.xpath("//span[normalize-space()='US - Personal']"));
        cu.clicking(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));*/
    /*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='My Leave']"))).click();
    WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")));
    ele.sendKeys(Keys.CONTROL + "a");
    ele.sendKeys(Keys.DELETE);
    ele.sendKeys("2026-03-04");
    WebElement ele1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")));
    ele1.sendKeys(Keys.CONTROL + "a");
    ele1.sendKeys(Keys.DELETE);
    ele1.sendKeys("2026-08-01");
//    WebElement clear=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='oxd-icon bi-x --clear']")));
//    if(!clear.getSize().equals(0))
//    {
//     clear.click();
//    }
while(true) {
    List<WebElement> clearIcons = driver.findElements(
            By.xpath("//i[contains(@class,'bi-x') and contains(@class,'--clear')]"));

    if (!clearIcons.isEmpty())
        clearIcons.get(0).click();
    break;
}
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select']"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Pending Approval']"))).click();
WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")));
element.click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='US - Personal']"))).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'] "))).click();
}*/
    }
}
