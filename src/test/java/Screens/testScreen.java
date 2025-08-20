package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testScreen {

    private AndroidDriver driver;

    @FindBy(id = "com.google.android.calculator:id/Nkosidigit_1")
    WebElement digitOne;

    public testScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressDigitOne() {
        System.out.println("pressDigitOne called");
        digitOne.click();
    }

}
