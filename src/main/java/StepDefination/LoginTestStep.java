package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class LoginTestStep {
WebDriver driver;
LoginPage objLoginPage;
    @Given("landing on the google webpage")
    public void landing_on_the_facebook_webpage() {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver");
        driver = new ChromeDriver();
        driver.get("your website");

        objLoginPage = new LoginPage(driver);

        //Scrolling Page Code

        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        objLoginPage.EnterEmail();
      //  objLoginPage.EnterPassword();

    }

    @When("entering username and password")
    public void entering_username_and_password() {

    }

    @Then("validating that i am logged in")
    public void validating_that_i_am_logged_in() {

    }

}
