package Pages;

import com.shaft.driver.SHAFT;

public class HomePage {
    private SHAFT.GUI.WebDriver driver;

    //////////////////////constructor////////////////////////
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //////////////////////Actions////////////////////////
    public HomePage navigate(){
        driver.browser().navigateToURL("http://automationexercise.com");
        return this;
    }
    //////////////////////Assertions////////////////////////
    public HomePage assertOnHomePageTitle(String expectedTitle){
        driver.browser().assertThat().title().isEqualTo(expectedTitle).perform();
        return this;
    }

}
