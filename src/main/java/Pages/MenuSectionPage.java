package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class MenuSectionPage {
    private SHAFT.GUI.WebDriver driver;
    private By signupLogin_button= By.xpath("//i[@class='fa fa-lock']");
    private By deleteAccount_Button= By.xpath("//i[@class='fa fa-trash-o']");
    private final By LoggedInUserName = By.xpath("//i[@class='fa fa-user']//parent::a");

    public MenuSectionPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public void clickOnSignupButton(){

        driver.element().click(signupLogin_button);
    }
    public void clickOnDeleteAccountButton(){

        driver.element().click(deleteAccount_Button);
    }

//    public void assertOnLoggedInUserNameVisibility(String signUpName) {
//        driver.element().assertThat(LoggedInUserName).text().isEqualTo("Logged in as "+signUpName).perform();
//    }
}
