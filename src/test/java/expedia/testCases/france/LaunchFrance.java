package expedia.testCases.france;

import expedia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LaunchFrance extends BaseTest {

    @Test
    public void verify_browser_Launch_Test_france() {
        france.navigate();
        Assert.assertTrue(france.getLandingPage().isFranceLogoPresent(), "France loading page is not loaded");
        System.out.println("verify_browser_Launch_Test_FRANCE"+ " " +Thread.currentThread().getId());

    }

    @Test
    public void verify_booking_options_section_exists_france() {
        france.navigate();
        Assert.assertTrue(france.getBookingSection().isBookingSectionExist());
        System.out.println("verify_booking_options_section_exists_FRANCE"+ " " +Thread.currentThread().getId());
    }

    @Test
    public void verify_booking_options_count_france() {
        france.navigate();
        Assert.assertEquals(france.getBookingOptions().getBookingOptionCount(), 5);
        System.out.println("verify_booking_options_count_FRANCE"+ " " +Thread.currentThread().getId());
    }

    @Test
    public void verify_booking_options_france() {
        france.navigate();
        List<String> expectedList = Arrays.asList("Séjours", "Vols", "Voitures", "Formules", "Activités");
        List<String> actualList = france.getBookingOptions().getBookingOptions();
        System.out.println(expectedList);
        System.out.println(actualList);
        assertThat("Compare options", expectedList, is(actualList));
        System.out.println("verify_booking_options_FRANCE"+ " " +Thread.currentThread().getId());
    }
}
