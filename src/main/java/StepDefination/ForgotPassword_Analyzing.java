package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class ForgotPassword_Analyzing {

  public LoginPage pass;
  WebDriver driver;




    @Given("landing on the facebook page")
    public void landing_on_the_facebook_page() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ideal projects\\AutomationFrameWork_TestProject\\Drivers\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        pass = new LoginPage(driver);
        pass.forgot();
        String  ss = pass.body();
        if(ss.contains("Please enter your email or phone number to search for your account."))
        {
            System.out.println("test is pass ");

        }
        else
        {
            System.out.println("Test is fail ");
        }

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("clicking on the forgot password link")
    public void clicking_on_the_forgot_password_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Analyzing the output of forgot password link")
    public void analyzing_the_output_of_forgot_password_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
