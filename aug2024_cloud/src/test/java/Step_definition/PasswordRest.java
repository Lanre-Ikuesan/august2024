package Step_definition;

import Base.TestBase;
import Pages.projectLocatorsAndMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PasswordRest extends TestBase {
    @Given("^l am on login screen$")
    public void lAmOnLoginScreen() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get(CONFIG.getProperty("LoginUrl"));
        driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/login/");
    }

    @And("^l click on forget passowrd$")
    public void lClickOnForgetPassowrd() {
        JavascriptExecutor jse = (JavascriptExecutor)driver; jse.executeScript("window.scrollBy(0,1000)");
            projectLocatorsAndMethods page = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
            page.clickForgetPasswordlink();
        }


    @And("^l enter the correct email address$")
    public void lEnterTheCorrectEmailAddress() {
        projectLocatorsAndMethods page = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        page.enterRetrievePasswordEmailAddress();
    }

    @When("^l click on the reset password button$")
    public void lClickOnTheResetPasswordButton() {
        projectLocatorsAndMethods page = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        page.ClickResetMyPasswordButton();
    }

    @Then("^l should receive a success message$")
    public void lShouldReceiveASuccessMessage() {
        projectLocatorsAndMethods page = PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        page.AssertRetrievePasswordSuccessMessage();
    }


}
