package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeScreen {
    private final AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Learn Automation the Right Way\"]")
    WebElement headingLearnAutomation;

    @FindBy(xpath = "//android.widget.Button[@text=\"Open menu\"]")
    WebElement buttonOpenMenu;

    @FindBy(xpath = "//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.widget.TextView[11]")
    WebElement headingLoginToAccessLearningMaterials;

    public HomeScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyHeadingLearnAutomationDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(headingLearnAutomation));
        headingLearnAutomation.isDisplayed();
    }
    public void clickOnOpenMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(buttonOpenMenu));
        buttonOpenMenu.click();
    }
    public void clickOnLearningMaterialTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(headingLoginToAccessLearningMaterials));
        headingLoginToAccessLearningMaterials.click();
    }
}
