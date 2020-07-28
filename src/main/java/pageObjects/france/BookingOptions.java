package pageObjects.france;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class BookingOptions {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "//a[@class='uitk-tab-anchor']")
    private List<WebElement> bookingOptions = null;

    public BookingOptions(final WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public int getBookingOptionCount() {
        wait.until(d -> bookingOptions.get(0).isDisplayed());
        return bookingOptions.size();
    }

    public List<String> getBookingOptions() {
        wait.until(d -> bookingOptions.get(0).isDisplayed());
        return bookingOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
