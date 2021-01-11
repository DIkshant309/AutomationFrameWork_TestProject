package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class SignUp_WithoutData {
    public LoginPage data;
    WebDriver driver;


    @Given("landing on the facebook webpage")
    public void landing_on_the_facebook_webpage() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ideal projects\\AutomationFrameWork_TestProject\\Drivers\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        data = new LoginPage(driver);

        data.Create_new();

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Clicking create new account")
    public void clicking_create_new_account_and_signup_without_entering_the_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Validating the create new user page")
    public void validating_the_error_given_the_but_the_create_new_user_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
