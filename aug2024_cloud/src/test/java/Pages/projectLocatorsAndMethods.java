package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projectLocatorsAndMethods {
    public int random;

    // Create Account Selectors/locators
    @FindBy(how = How.XPATH, using = " //input[@id=\"firstname\"]")
    public static WebElement CreateAcc_firstname;

    @FindBy(how = How.XPATH, using = "//input[@id=\"lastname\"]")
    public static WebElement CreateAcc_lastname;

    @FindBy(how = How.XPATH, using = "//input[@id=\"email_address\"]")
    public static WebElement CreateAcc_email_address;

    @FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
    public static WebElement CreateAcc_password;

    @FindBy(how = How.XPATH, using = "//input[@id=\"password-confirmation\"]")
    public static WebElement CreateAcc_password_confirmation;

    @FindBy(how = How.XPATH, using = "//button[@title=\"Create an Account\"]")
    public static WebElement CreateAcc_Button;

    @FindBy(how = How.CLASS_NAME, using = "logged-in")
    public static WebElement LoggedInUser;

    // Login Selectors/locators
    @FindBy(how = How.ID, using = "email")
    public static WebElement login_email;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement login_password;

    @FindBy(how = How.ID, using = "send2")
    public static WebElement login_button;

    @FindBy(how = How.CLASS_NAME, using = "messages")
    public static WebElement InvalidLoginMessage;

    // Create Account Methods
    public void enterUserfirstname() {
        CreateAcc_firstname.sendKeys("Chepchumba");
    }

    public void enterUserLastname() {
        CreateAcc_lastname.sendKeys("Chumbaa");
    }

    public void enterUseremailadress() {
        random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
        CreateAcc_email_address.sendKeys("chumba" + random + "@gmail.com");
    }

    public void enterUserpassword() {
        CreateAcc_password.sendKeys("Lenovo750Y");
    }

    public void enterUserpassword_confirmation() {
        CreateAcc_password_confirmation.sendKeys("Lenovo750Y");
    }

    public void clickCreateAcc() {
        CreateAcc_Button.click();
    }

    public void assertloggedInUser() {
        String ExpectedLoggedInUser = "Welcome, Chepchumba Chumbaa!";
        String ActualLoggedInUser = LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }

    // Login Methods
    public void enterEmail() {
        login_email.sendKeys("nasiressuman@yahoo.com");
    }

    public void enterPassword() {
        login_password.sendKeys("August2024");
    }

    public void clickButton() throws InterruptedException {
        login_button.click();
        Thread.sleep(3000);
    }

    public void enterExampleEmail(String username) throws Throwable {
        login_email.sendKeys(username);
    }

    public void enterExamplePassword(String Password) throws Throwable {
        login_password.sendKeys(Password);
    }

    public void assertLoggedInUser() {
        String ExpectedLoggedInUser = "Welcome, Kofi Essuman!";
        String ActualLoggedInUser = LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);
    }

    public void AssertInvalidLoginMessage() {
        String ExpectederrorMessage = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
        String ActualerrorMessage = InvalidLoginMessage.getText();
        Assert.assertEquals(ExpectederrorMessage, ActualerrorMessage);
        System.out.println(ActualerrorMessage);
    }
}
