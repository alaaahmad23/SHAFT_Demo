package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AccountCreatedPage {
    private SHAFT.GUI.WebDriver driver;

    //////////////////////locators////////////////////////
    private By accountCreated_Text=By.xpath("//h2[@class='title text-center']/b");
    private By continue_Button= By.xpath("//a[@data-qa='continue-button']");

    public AccountCreatedPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }

    //////////////////////Actions////////////////////////
    public AccountCreatedPage clickOnContinueButton(){
        driver.element().click(continue_Button);
        return this;
    }

    //////////////////////Assertions////////////////////////

    public void assertOnAccountCreatedIsDisplayed(String expectedText){
        driver.element().assertThat(accountCreated_Text).text().isEqualTo(expectedText).perform();
    }
}
