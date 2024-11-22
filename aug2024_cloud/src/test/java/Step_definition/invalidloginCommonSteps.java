package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class invalidloginCommonSteps extends TestBase {


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(CONFIG.getProperty("LoginUrl"));
    }
}
