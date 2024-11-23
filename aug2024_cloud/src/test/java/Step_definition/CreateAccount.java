package Step_definition;

import Base.TestBase;
import Pages.projectLocatorsAndMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends TestBase {
    public int random;
    // @Given("^I navigate to the login screen$")
    //public void iNavigateToTheLoginScreen() {
    // WebDriverManager.chromedriver().setup();
    //initialize the driver
    // driver=new ChromeDriver();
    // driver.manage().window().maximize();
    // driver.navigate().to( "https://magento.softwaretestingboard.com/customer/account/create/");
    // driver.get(CONFIG.getProperty("CreateAccountUrl" ));

    //  }


    @And("^I enter all mandatory information$")
    public void iEnterAllMandatoryInformation() {
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        projectLocatorsAndMethods pages= PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        pages.enterUserfirstname();
        pages.enterUserLastname();
        pages.enterUseremailadress();
        pages.enterUserpassword();
        pages.enterUserpassword_confirmation();
        pages.clickCreateAccount();
        // pages.assertloggedInUser();
        //driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Chepchumba");
        //driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Chumbaa");
        //driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys("chumba" + random + "@gmail.com");
        //driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Lenovo750Y");
        //driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys("Lenovo750Y");


    }

    @When("^I select the register button$")
    public void iSelectTheRegisterButton() throws InterruptedException {
        projectLocatorsAndMethods pages= PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        Thread.sleep(3000);
    }

    @Then("^My account should be created successfully$")
    public void myAccountShouldBeCreatedSuccessfully() {
        projectLocatorsAndMethods pages= PageFactory.initElements(driver, projectLocatorsAndMethods.class);
        //pages.assertloggedInUser();
        //String ExpectedLoggedInUser="Welcome, Chepchumba Chumbaa!";
        //String ActualLoggedInUser=driver.findElement(By.className("logged-in")).getText();
        //Assert.assertEquals(ExpectedLoggedInUser,ActualLoggedInUser);
        //System.out.println(ActualLoggedInUser);

//driver.close();
    }
}


