package countries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.france.BookingOptions;
import pageObjects.france.BookingSection;
import pageObjects.france.LandingPage;

public class FranceFactory {
    private ThreadLocal<WebDriver> driver;
    private BookingOptions bookingOptions;
    private BookingSection bookingSection;
    private LandingPage landingPage;

    public FranceFactory(final ThreadLocal<WebDriver> driver) {
        this.driver = driver;
        this.bookingOptions = PageFactory.initElements(getDriver(), BookingOptions.class);
        this.bookingSection = PageFactory.initElements(getDriver(), BookingSection.class);
        this.landingPage = PageFactory.initElements(getDriver(), LandingPage.class);
    }

    private WebDriver getDriver() {
        return this.driver.get();
    }

    public void navigate() {
        getDriver().get("https://expedia.fr");
    }


    public BookingOptions getBookingOptions() {
        return bookingOptions;
    }

    public BookingSection getBookingSection() {
        return bookingSection;
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }
}
