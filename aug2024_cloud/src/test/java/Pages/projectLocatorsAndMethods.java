package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projectLocatorsAndMethods {
    public int random;
    //declare your selectors/locators
    @FindBy(how = How.XPATH, using = " //input[@id=\"firstname\"]")
    public static WebElement CreateAcc_firstname;


    @FindBy(how = How.XPATH, using = "//input[@id=\"lastname\"]")
    public static WebElement CreateAcc_lastname;

    @FindBy(how = How.XPATH, using = "//input[@id=\"email_address\"] ")
    public static WebElement CreateAcc_email_address;


    @FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
    public static WebElement CreateAcc_password;


    @FindBy(how = How.XPATH, using = "//input[@id=\"password-confirmation\"]")
    public static WebElement CreateAcc_password_confirmation;



    @FindBy(how = How.XPATH, using = "//button[@title=\"Create an Account\"]")
    public static WebElement CreateAcc_Button;



    @FindBy(how = How.CLASS_NAME, using = "logged-in")
    public static WebElement LoggedInUser;


    //Declare your methods here
    public void enterUserfirstname() {
        CreateAcc_firstname.sendKeys( "Chepchumba");
    }
    public void enterUserLastname() {
        CreateAcc_lastname.sendKeys( "Chumbaa");
    }
    public void enterUseremailadress() {
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        CreateAcc_email_address.sendKeys( "chumba" + random + "@gmail.com");
    }

    public void enterUserpassword() {
        CreateAcc_password.sendKeys( "Lenovo750Y");
    }

    public void enterUserpassword_confirmation() {
        CreateAcc_password_confirmation.sendKeys( "Lenovo750Y");
    }
    public void clickCreateAcc() {
        CreateAcc_Button.click();
    }
    public void assertloggedInUser(){
        String ExpectedLoggedInUser="Welcome, Chepchumba Chumbaa!";
        String ActualLoggedInUser=LoggedInUser.getText();
        Assert.assertEquals(ExpectedLoggedInUser,ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);

    }


    public void clickCreateAccount() {
    }
}



