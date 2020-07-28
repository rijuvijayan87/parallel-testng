package pageObjects.france;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "//img[contains(@src, 'expedia.fr')]")
    private WebElement expediaFranceLogo;

    public LandingPage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public boolean isFranceLogoPresent() {
        return wait.until((d -> expediaFranceLogo.isDisplayed()));
    }

}
