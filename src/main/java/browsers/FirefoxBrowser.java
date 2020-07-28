package browsers;

import drivers.DriverManger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser extends DriverManger {

    @Override
    public WebDriver getDriver() {
        try {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (driver != null) {
            return driver;
        } else {
            return null;
        }
    }
}
