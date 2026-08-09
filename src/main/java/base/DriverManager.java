package base;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileNotFoundException;

public class DriverManager {

private WebDriver driver;
private ConfigReader configReader;

public WebDriver launchBrowser() throws FileNotFoundException {
    configReader = new ConfigReader();

    String browser = configReader.getBrowser();

    if (browser.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("safari")) {
        driver = new SafariDriver();
    } else {
        throw new RuntimeException("Browser not supported: " + browser);
    }

    driver.manage().window().maximize();
    driver.get(configReader.getUrl());
    return driver;
}

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}




