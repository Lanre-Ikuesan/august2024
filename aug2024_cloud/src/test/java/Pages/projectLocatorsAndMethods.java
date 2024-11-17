package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projectLocatorsAndMethods {
    @FindBy(how = How.LINK_TEXT,using =("Forgot Your Password?"))
    public static WebElement ForgetPassword;

    @FindBy(how = How.XPATH,using =("//input[@id='email_address']"))
    public static WebElement email_addressRetrievePassword;

    @FindBy(how = How.XPATH,using =("//button[@class='action submit primary']"))
    public static WebElement Reset_MyPasswordButton;
    @FindBy(how = How.XPATH,using =("//*[@id='maincontent']/div[2]/div[2]/div/div/div"))
    public static WebElement ResetPasswordSuccess_Message;

    //Declare your methods here
    public void clickForgetPasswordlink() {
        ForgetPassword.click();
    }
    public void enterRetrievePasswordEmailAddress() {
        email_addressRetrievePassword.sendKeys("Kingsleykoffi@gmail.com");
    }
    public void ClickResetMyPasswordButton() {
        Reset_MyPasswordButton.click();
    }
    public void AssertRetrievePasswordSuccessMessage() {
        String ExpectedSuccessMessage = "If there is an account associated with Kingsleykoffi@gmail.com you will receive an email with a link to reset your password.";
        String ActualSuccessMessage = ResetPasswordSuccess_Message.getText();
        Assert.assertEquals(ExpectedSuccessMessage, ActualSuccessMessage);
        System.out.println(ActualSuccessMessage);
    }
    }
