package Steps;

import Screens.HomeScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class StepDefinition {

    HomeScreen homeScreen;
//    LearningMaterialsScreen learningMaterialsScreen;

    @Given("I an android device open with chrome browser")
    public void iAnAndroidDeviceOpenWithChromeBrowser() throws MalformedURLException {
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory(); // true for iOS
        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
    }
    @When("I open the Ndosi website")
    public void i_open_the_ndosi_website() {
        AndroidDriver driver = AppiumDriverFactory.getDriver();
        driver.get("https://www.ndosiautomation.co.za/");
    }
    @And("I should see the the heading Learn Automation the Right Way displayed")
    public void i_should_see_the_the_heading_learn_automation_the_right_way_displayed() {
        homeScreen.verifyHeadingLearnAutomationDisplayed();
    }
    @And("I click on the burger menu")
    public void i_click_on_the_burger_menu() {
        homeScreen.clickOnMenuButton();
    }
    @And("I click learning material tab")
    public void i_click_learning_material_tab() {
        homeScreen.clickOnLearningMaterialTab();
//        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
    }
    @And("I should see the heading Login to Access Learning Materials displayed")
    public void i_should_see_the_heading_login_to_access_learning_materials_displayed() {

    }
    @And("I put my login username admin")
    public void i_put_my_login_username_admin() {

    }
    @And("I put my login password ndosi")
    public void i_put_my_login_password_ndosi() {

    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {

    }
    @Then("I should see the heading Practice Assessments displayed")
    public void i_should_see_the_heading_practice_assessments_displayed() {

    }

}
