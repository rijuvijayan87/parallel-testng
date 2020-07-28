package expedia;

import countries.FranceFactory;
import countries.NetherlandsFactory;
import drivers.DriverFactory;
import drivers.DriverManger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected DriverManger driverManger;
    protected WebDriver driverParam;
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected FranceFactory france;
    protected NetherlandsFactory netherlands;

    @BeforeClass
    @Parameters({"browser"})
    public void setup(@Optional String browser) {
        DriverFactory driverFactory = new DriverFactory();
        this.driverManger = driverFactory.get(getBrowser(browser));
        this.driverParam = this.driverManger.getDriver();
        driver.set(driverParam);
        this.france = new FranceFactory(driver);
        this.netherlands = new NetherlandsFactory(driver);
    }

    private String getBrowser(String browser) {
        if ((browser == null) || (browser.equalsIgnoreCase(""))) {
            return "chrome";
        }
        return browser;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.get().manage().deleteAllCookies();
            driver.get().quit();
            driver = null;
        }
    }
}
