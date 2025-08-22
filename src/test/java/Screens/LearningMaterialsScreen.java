package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LearningMaterialsScreen {
    private final AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Login to Access Learning Materials\"]")
    WebElement loginToAccessLearningMaterialsHeading;

    @FindBy(xpath = "//android.view.View[@resource-id=\"root\"]" +
            "/android.view.View[2]/android.view.View/android.widget.EditText[1]")
    WebElement usernameInputField;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Password for admin saved for ndosiautomation.vercel.app, 1 of 1.\"]/android.widget.LinearLayout")
    WebElement passwordInputFieldContainer;

    @FindBy(xpath = "//android.view.View[@resource-id=\"root\"]" +
            "/android.view.View[2]/android.view.View/android.widget.EditText[2]")
    WebElement passwordInputField;

    @FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    WebElement loginButton;

    public LearningMaterialsScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyLoginToAccessLearningMaterialsHeadingDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(loginToAccessLearningMaterialsHeading));
        loginToAccessLearningMaterialsHeading.isDisplayed();
    }
    public void clickOnUsernameInputField() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(usernameInputField));
        usernameInputField.click();
    }
    public void clickOnPasswordInputField() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(passwordInputFieldContainer));
        passwordInputFieldContainer.click();
    }
    public void enterUsername(String arg0) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(usernameInputField));
        usernameInputField.sendKeys(arg0);
    }
    public void enterPassword(String arg0) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.click();
        passwordInputField.sendKeys(arg0);
        loginToAccessLearningMaterialsHeading.click();
    }

    public void clickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

}
