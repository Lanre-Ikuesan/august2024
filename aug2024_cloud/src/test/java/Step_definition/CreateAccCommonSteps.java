package Step_definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class CreateAccCommonSteps extends TestBase {
    @Before
    public void setup() throws IOException{
        initialize();
    }
    @Given("^I am on the create account page$")
    public void iAmOnTheCreateAccountPage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to( "https://magento.softwaretestingboard.com/customer/account/");
        driver.get(CONFIG.getProperty("CreateAccountUrl"));

    }

}


