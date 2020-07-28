package expedia.testCases.netherlands;

import expedia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LaunchNetherlands extends BaseTest {

    @Test
    public void verify_browser_Launch_Test_netherlands() {
        netherlands.navigate();
        Assert.assertTrue(netherlands.getLandingPage().isNetherlandsLogoPresent(), "Netherlands loading page is not loaded");
        System.out.println("verify_browser_Launch_Test_NETHERLANDS"+ " " +Thread.currentThread().getId());
    }

    @Test
    public void verify_booking_options_section_exists_netherlands() {
        netherlands.navigate();
        Assert.assertTrue(netherlands.getBookingSection().isBookingSectionExist());
        System.out.println("verify_booking_options_section_exists_NETHERLANDS"+ " " +Thread.currentThread().getId());
    }

    @Test
    public void verify_booking_options_count_netherlands() {
        netherlands.navigate();
        Assert.assertEquals(netherlands.getBookingOptions().getBookingOptionCount(), 5);
        System.out.println("verify_booking_options_count_NETHERLANDS"+ " " +Thread.currentThread().getId());
    }

    @Test
    public void verify_booking_options_netherlands() {
        netherlands.navigate();
        List<String> expectedList = Arrays.asList("Verblijven", "Vluchten", "Auto's", "Pakketten", "Activiteiten");
        List<String> actualList = netherlands.getBookingOptions().getBookingOptions();
        System.out.println(expectedList);
        System.out.println(actualList);
        assertThat("Compare options", expectedList, is(actualList));
        System.out.println("verify_booking_options_NETHERLANDS"+ " " +Thread.currentThread().getId());
    }
}
