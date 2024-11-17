package Step_definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ValidLoginCommonSteps extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(CONFIG.getProperty("LoginUrl"));
    }
}

