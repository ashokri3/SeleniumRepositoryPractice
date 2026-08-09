package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class AddEmployeePage {

    WebDriver driver;
    WaitUtils wait;

    // Locators
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By formLoader = By.cssSelector(".oxd-form-loader");
    By saveButton = By.cssSelector("button[type='submit']");

    // Constructor
    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    // Actions
    public void enterFirstName(String firstNameValue) {
        wait.type(firstName, firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        wait.type(lastName, lastNameValue);
    }

    public void waitForLoaderToDisappear() {
        wait.waitForInvisibility(formLoader);
    }

    public void clickSave() {
        wait.click(saveButton);
    }
}