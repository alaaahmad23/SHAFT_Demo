package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SignUpPage {
    private SHAFT.GUI.WebDriver driver;
    //////////////////////locators////////////////////////
    private By newUserSignup_Text= By.xpath("//div[@class='signup-form']/h2");
    private By name_Input= By.xpath("//input[@data-qa='signup-name']");
    private By email_Input=By.xpath("//input[@data-qa='signup-email']");
    private By signup_button=By.xpath("//button[@data-qa='signup-button']");

    public SignUpPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public void signup(String name, String email){
        driver.element().type(name_Input,name);
        driver.element().type(email_Input,email);
        driver.element().click(signup_button);
    }

    //////////////////////Assertions////////////////////////
    public void assertOnNewUserSignupTextIsDisplayed(String expectedText){
        driver.element().assertThat(newUserSignup_Text).text().equals(expectedText);
    }

}
