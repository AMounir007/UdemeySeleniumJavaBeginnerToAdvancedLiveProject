package abstractHelperClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestScenario {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver(getChromeOptions());
    }

    @AfterClass
    public void methodName() {
        driver.quit();
    }
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.setAcceptInsecureCerts(true);
        return options;
    }
}
