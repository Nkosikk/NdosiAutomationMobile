package Steps;

import Screens.*;
import Utils.*;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import java.net.MalformedURLException;

public class StepDefinition {
    HomeScreen homeScreen;
    LearningMaterialsScreen learningMaterialsScreen;
    LandingScreen landingScreen;

    @Given("The android device open with chrome browser")
    public void The_android_device_open_with_chrome_browser() throws MalformedURLException {
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
    }

    @When("I open the Ndosi website")
    public void i_open_the_ndosi_website() {
        AndroidDriver driver = AppiumDriverFactory.getDriver();
        driver.get("https://www.ndosiautomation.co.za/");
    }

    @And("I should see the heading Learn Automation the Right Way displayed")
    public void i_should_see_the_heading_learn_automation_the_right_way_displayed() {
        homeScreen.verifyHeadingLearnAutomationDisplayed();
    }

    @And("I click on the OpenMenu")
    public void i_click_on_the_OpenMenu() {
        homeScreen.clickOnOpenMenu();
    }

    @And("I click learning material tab")
    public void i_click_learning_material_tab() {
        homeScreen.clickOnLearningMaterialTab();
        this.learningMaterialsScreen = new LearningMaterialsScreen(AppiumDriverFactory.getDriver());

    }

    @And("I should see the heading Login to Access Learning Materials displayed")
    public void i_should_see_the_heading_login_to_access_learning_materials_displayed() {
        learningMaterialsScreen.verifyLoginToAccessLearningMaterialsHeadingDisplayed();

    }

    @And("I login using user with id {int}")
    public void iLoginUsingUserWithId(int arg0) {
        DatabaseConnection.User user = DatabaseConnection.getUserById(arg0);

        learningMaterialsScreen.clickOnUsernameInputField();
        learningMaterialsScreen.enterUsername(user.getUsername());
        learningMaterialsScreen.enterPassword(user.getPassword());

    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        learningMaterialsScreen.clickLoginButton();
        this.landingScreen = new LandingScreen(AppiumDriverFactory.getDriver());
    }

    @Then("I should see the heading Practice Assessments displayed")
    public void i_should_see_the_heading_practice_assessments_displayed() {
        landingScreen.verifyPracticalAssignmentHeading();
    }

    @After
    public void tearDown() {
        AppiumDriverFactory.getDriver().quit();
    }

}
