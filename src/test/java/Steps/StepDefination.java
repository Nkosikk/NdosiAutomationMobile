package Steps;

import Screens.HomeScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class StepDefination {

    HomeScreen homeScreen;

    @Given("I an andrid device open with chrome browser")
    public void i_an_andrid_device_open_with_chrome_browser() throws MalformedURLException {
        String packageId = "com.android.chrome";
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory(packageId); // true for iOS
        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
    }
    @When("I open the Ndosi website")
    public void i_open_the_ndosi_website() {

    }
    @And("I should see the the heading Learn Automation the Right Way desplayed")
    public void i_should_see_the_the_heading_learn_automation_the_right_way_desplayed() {

    }
    @And("I click on the baggur menu")
    public void i_click_on_the_baggur_menu() {

    }
    @And("I click learning material tab")
    public void i_click_learning_material_tab() {

    }
    @And("I should see the heading Login to Access Learning Materials desplayed")
    public void i_should_see_the_heading_login_to_access_learning_materials_desplayed() {

    }
    @And("I put my login username admin")
    public void i_put_my_login_username_admin() {

    }
    @And("I put my login password admin")
    public void i_put_my_login_password_admin() {

    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {

    }
    @Then("I should see the heading Practice Assessments desplayed")
    public void i_should_see_the_heading_practice_assessments_desplayed() {

    }


}
