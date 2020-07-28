package browsers;

import drivers.DriverManger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends DriverManger {

    @Override
    public WebDriver getDriver() {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
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
