package countries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.netherlands.BookingOptions;
import pageObjects.netherlands.BookingSection;
import pageObjects.netherlands.LandingPage;

public class NetherlandsFactory {

    private ThreadLocal<WebDriver> driver;
    private LandingPage landingPage;
    private BookingOptions bookingOptions;
    private BookingSection bookingSection;

    public NetherlandsFactory(final ThreadLocal<WebDriver> driver) {
        this.driver = driver;
        this.landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
        this.bookingOptions = PageFactory.initElements(getDriver(), BookingOptions.class);
        this.bookingSection = PageFactory.initElements(getDriver(), BookingSection.class);
    }

    private WebDriver getDriver() {
        return this.driver.get();
    }


    public void navigate() {
        getDriver().get("https://expedia.nl");
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }

    public BookingOptions getBookingOptions() {
        return bookingOptions;
    }

    public BookingSection getBookingSection() {
        return bookingSection;
    }
}
