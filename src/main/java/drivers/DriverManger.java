package drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManger {

    protected WebDriver driver;


    public abstract WebDriver getDriver();

}
