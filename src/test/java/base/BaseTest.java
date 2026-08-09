package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.time.Duration;

public class BaseTest {

    protected DriverManager driverManager;
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup() throws FileNotFoundException, FileNotFoundException, InterruptedException {
        driverManager  = new DriverManager();
        driver = driverManager.launchBrowser();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driverManager.closeBrowser();
    }

}