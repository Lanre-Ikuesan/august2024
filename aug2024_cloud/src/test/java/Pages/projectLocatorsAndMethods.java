package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class projectLocatorsAndMethods {

    // Declare selectors/locators here

    @FindBy(how = How.ID, using = "email")
    public static WebElement login_email;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement login_password;

    @FindBy(how = How.ID, using = "send2")
    public static WebElement login_button;

    @FindBy(how = How.CLASS_NAME, using = "logged-in")
    public static WebElement LoggedIn;

    //Declare methods here
    public void enterEmail() { login_email.sendKeys("nasiressuman@yahoo.com");
    }

    public void enterPassword() { login_password.sendKeys("August2024");
    }

    public void clickButton() throws InterruptedException {
        login_button.click();
        Thread.sleep(3000);
    }

    public void assertLoggedInUser() {
        String ExpectedLoggedInUser = "Welcome, Kofi Essuman!";
        String ActualLoggedInUser = LoggedIn.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);

    }
}
