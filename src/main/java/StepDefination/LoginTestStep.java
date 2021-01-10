package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class LoginTestStep {
    public LoginPage abc;
    WebDriver driver;

    @Given("landing on the google webpage")
    public void landing_on_the_facebook_webpage() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ideal projects\\AutomationFrameWork_TestProject\\Drivers\\chromedriver_win32\\chromedriver.exe" );
         driver = new ChromeDriver(); /*instantiation*/
        driver.get("https://www.facebook.com/");
        abc = new LoginPage(driver);
        abc.EnterEmail("diksahntsehgal@ymail.com");
        abc.EnterPassword("abc");
        abc.login();
        String def = abc.error();
        System.out.println(def);
        if (def.contains(" doesn’t match any account.")){

            System.out.println("test pass");

        }
        else{
            System.out.println("fail");
        }

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("entering username and password")
    public void entering_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    @Then("validating that i am logged in")
    public void validating_that_i_am_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }


}
