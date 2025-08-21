package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingScreen {
    private final AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Practice Assessments\"]")
    WebElement webView;

    public LandingScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyPracticalAssignmentHeading() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(webView));
        webView.isDisplayed();
    }
}
