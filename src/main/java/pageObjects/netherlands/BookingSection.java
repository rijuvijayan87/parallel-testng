package pageObjects.netherlands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingSection {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "//div[@class='uitk-cell lobFormInCard']")
    private WebElement bookingSection;

    public BookingSection(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public boolean isBookingSectionExist() {
        return wait.until((d -> bookingSection.isDisplayed()));
    }
}
