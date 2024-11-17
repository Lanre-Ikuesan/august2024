package Step_definition;

import Base.TestBase;
import Pages.projectLocatorsAndMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin extends TestBase {
    @When("^I enter the correct username$")
    public void i_enter_the_correct_username() throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.enterEmail();
    }

    @When("^I enter the correct password$")
    public void i_enter_the_correct_password() throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.enterPassword();
    }

    @When("^I click login button$")
    public void i_click_login_button() throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.clickButton();
        Thread.sleep(3000);
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.assertLoggedInUser();

        driver.close();
    }

}


