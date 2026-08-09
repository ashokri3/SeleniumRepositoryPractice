package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class DashboardPage {

    WebDriver driver;
    WaitUtils wait;

    // Locators
    By dashboardHeading = By.xpath("//h6[text()='Dashboard']");
    By pim = By.xpath("//span[text()='PIM']");
    By addEmployee = By.xpath("//a[text()='Add Employee']");

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    // Actions
    public boolean isDashboardDisplayed() {
        return wait.waitForVisibility(dashboardHeading).isDisplayed();
    }

    public void clickPIM() {
        wait.click(pim);
    }

    public void clickAddEmployee() {
        wait.click(addEmployee);
    }
}