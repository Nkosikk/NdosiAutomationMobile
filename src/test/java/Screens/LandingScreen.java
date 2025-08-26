package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingScreen {
    AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"AthiPractice Assessments\"]")
    WebElement practiceAssessmentsHeading;

    public LandingScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyHeadingPracticeAssessmentsDisplayed() {
        practiceAssessmentsHeading.isDisplayed();
    }
}
