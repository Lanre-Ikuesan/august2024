package Step_definition;

import Base.TestBase;
import Pages.projectLocatorsAndMethods;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class invalidlogin extends TestBase {

    @When("^I type in my \"([^\"]*)\"$")
    public void iTypeInMy(String username) throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.enterExampleEmail(username);
    }

    @And("^I provide my \"([^\"]*)\"$")
    public void iProvideMy(String Password) throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.enterExamplePassword(Password);
    }

    @When("^attempt to log in$")
    public void attemptToLogIn() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver; jse.executeScript("window.scrollBy(0,550)");
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.clickButton();
    }

    @Then("^I should see the correct \"([^\"]*)\"$")
    public void iShouldSeeTheCorrect(String arg0) throws Throwable {
        projectLocatorsAndMethods pages = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.AssertInvalidLoginMessage();
        driver.close();
    }
}

