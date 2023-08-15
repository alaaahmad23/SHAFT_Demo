package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class EnterAccountInfoPage {
    private SHAFT.GUI.WebDriver driver;

    //////////////////////locators////////////////////////
    private By enterACCOUNTINFO_Text = By.xpath("//div[@class='login-form']/h2/b");;
    private By gender_Button = By.id("id_gender2");
    private By password_Input = By.id("password");
    private By newsLetter_Button=By.id("newsletter");
    private By option_Button= By.id("optin");
    private By days_Input=By.id("days");
    private By months_Input=By.id("months");
    private By years_Input=By.id("years");
    private By firstName_Input=By.id("first_name");
    private By lastName_Input= By.id("last_name");
    private By address1_Input= By.id("address1");
    private By address2_Input= By.id("address2");
    private By country_Input=By.id("country");
    private By state_Input=By.id("state");
    private By city_Input=By.id("city");
    private By zipcode_Input=By.id("zipcode");
    private By mobileNnumber_Input= By.id("mobile_number");
    private By createAccount_Button= By.xpath("//button[@data-qa='create-account']");

    //////////////////////constructor////////////////////////
    public EnterAccountInfoPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //////////////////////Actions////////////////////////
    public void enterAccountInfo(String password,String days,String months,String years){
        driver.element().click(gender_Button);
        driver.element().type(password_Input,password);
        driver.element().click(newsLetter_Button);
        driver.element().click(option_Button);
        driver.element().select(days_Input,days);
        driver.element().select(months_Input,months);
        driver.element().select(years_Input,years);

    }
    public void enterAddress(String firstName,String lastName,String address1,String address2,String country,String state,String city,String zipcode,String mobile){
        driver.element().type(firstName_Input,firstName);
        driver.element().type(lastName_Input,lastName);
        driver.element().type(address1_Input,address1);
        driver.element().type(address2_Input,address2);
        driver.element().select(country_Input,country);
        driver.element().type(state_Input,state);
        driver.element().type(city_Input,city);
        driver.element().type(zipcode_Input,zipcode);
        driver.element().type(mobileNnumber_Input,mobile);
        driver.element().click(createAccount_Button);
    }
    //////////////////////Assertions////////////////////////

    public void assertOnEnterAccountInfoTextIsDisplayed(String expectedText){
        driver.element().assertThat(enterACCOUNTINFO_Text).text().isEqualTo(expectedText).perform();
    }



}
