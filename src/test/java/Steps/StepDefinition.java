package Steps;

import Screens.HomeScreen;
import Screens.LandingScreen;
import Screens.LearningMaterialsScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

import static Steps.Hooks.driver;

public class StepDefinition {

    HomeScreen homeScreen;
    LearningMaterialsScreen learningMaterialsScreen;
    LandingScreen landingScreen;


    @Given("I an android device open with chrome browser")
    public void iAnAndroidDeviceOpenWithChromeBrowser() throws MalformedURLException {
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
        this.learningMaterialsScreen = new LearningMaterialsScreen(AppiumDriverFactory.getDriver());
        this.landingScreen = new LandingScreen(AppiumDriverFactory.getDriver());

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
//        this.learningMaterialsScreen = new LearningMaterialsScreen(AppiumDriverFactory.getDriver());
    }
    @And("I should see the heading Login to Access Learning Materials displayed")
    public void i_should_see_the_heading_login_to_access_learning_materials_displayed() {
        learningMaterialsScreen.verifyHeadingLoginToAccessLearningMaterialsDisplayed();
    }
    @And("I put my login username (.*)$")
    public void i_put_my_login_username_admin(String username) {
        learningMaterialsScreen.clickOnUserNameField();
        learningMaterialsScreen.enterUsername(username);
    }
    @And("I put my login password (.*)$")
    public void i_put_my_login_password_ndosi(String password) {
        learningMaterialsScreen.clickOnPasswordField();
        learningMaterialsScreen.enterPassword(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        learningMaterialsScreen.clickOnHeadingLoginToAccessLearningMaterials();
        learningMaterialsScreen.clickOnLoginButton();
    }
    @Then("I should see the heading Practice Assessments displayed")
    public void i_should_see_the_heading_practice_assessments_displayed() {
        landingScreen.verifyHeadingPracticeAssessmentsDisplayed();
    }
    @AfterStep
    public void afterStep() {
        driver.quit();
    }

}
