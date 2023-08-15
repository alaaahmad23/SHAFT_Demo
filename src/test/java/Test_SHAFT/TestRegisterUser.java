package Test_SHAFT;

import Pages.*;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegisterUser  {
 SHAFT.GUI.WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://automationexercise.com/");
    }

    @Test
    public void test1(){
            new HomePage(driver).assertOnHomePageTitle("Automation Exercise");
            new MenuSectionPage(driver).clickOnSignupButton();
//            new MenuSectionPage(driver).assertOnLoggedInUserNameVisibility("Alaa");
            new SignUpPage(driver).assertOnNewUserSignupTextIsDisplayed("New User Signup!");
            new SignUpPage(driver).signup("Alaa","alaa.ahhmadd23s01@gmail.com");
            new EnterAccountInfoPage(driver).assertOnEnterAccountInfoTextIsDisplayed("ENTER ACCOUNT INFORMATION");
            new EnterAccountInfoPage(driver).enterAccountInfo("123456778","12","March","2003");
            new EnterAccountInfoPage(driver).enterAddress("alaa","Ahmad","cairo","giza","India","y","Minya","123","010706857");
            new AccountCreatedPage(driver).assertOnAccountCreatedIsDisplayed("ACCOUNT CREATED!");
            new AccountCreatedPage(driver).clickOnContinueButton();
            new MenuSectionPage(driver).clickOnDeleteAccountButton();
            new AccountDeletedPage(driver).assertOnAccountDeletedIsDisplayed("ACCOUNT DELETED!");
        }
}
