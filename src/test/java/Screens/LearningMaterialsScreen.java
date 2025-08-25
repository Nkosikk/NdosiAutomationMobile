package Screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearningMaterialsScreen {
    AppiumDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Login to Access Learning Materials\"]")
    WebElement headingLoginToAccessLearningMaterials;

    public LearningMaterialsScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyHeadingLoginToAccessLearningMaterialsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(headingLoginToAccessLearningMaterials));
        headingLoginToAccessLearningMaterials.isDisplayed();
    }
}
