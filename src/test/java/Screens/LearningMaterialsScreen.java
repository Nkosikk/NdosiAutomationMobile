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

    @FindBy(xpath = "//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.widget.EditText[1]")
    WebElement usernameField;

    @FindBy(xpath = "//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View/android.widget.EditText[2]")
    WebElement passwordField;

    @FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    WebElement buttonLogin;

    public LearningMaterialsScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyHeadingLoginToAccessLearningMaterialsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(headingLoginToAccessLearningMaterials));
        headingLoginToAccessLearningMaterials.isDisplayed();
    }
    public void clickOnUserNameField(){
        usernameField.click();
    }
    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }
    public void clickOnPasswordField(){
        passwordField.click();
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickOnHeadingLoginToAccessLearningMaterials(){
        headingLoginToAccessLearningMaterials.click();
    }

    public void clickOnLoginButton(){
        buttonLogin.click();
    }
}
