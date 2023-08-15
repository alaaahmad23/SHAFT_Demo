package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AccountDeletedPage {
    private SHAFT.GUI.WebDriver driver;
    //////////////////////locators////////////////////////
    private By accountDeleted_Text=By.xpath("//h2[@class='title text-center']/b");

    //////////////////////constructor////////////////////////
    public AccountDeletedPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //////////////////////Assertion////////////////////////
    public void assertOnAccountDeletedIsDisplayed(String expectedText){
        driver.element().assertThat(accountDeleted_Text).text().isEqualTo(expectedText).perform();
    }

}
