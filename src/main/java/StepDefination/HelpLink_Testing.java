package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class HelpLink_Testing {
    LoginPage help;
    WebDriver driver;

    @Given("landing on the facebook site")
    public void landing_on_the_facebook_site() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ideal projects\\AutomationFrameWork_TestProject\\Drivers\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        help = new LoginPage(driver);
        help.help();
        String output = help.help_output();
        if(output.contains("Help Center"))
        {
            System.out.println("test is pass");
        }
        else
        {
            System.out.println("test is failed");
        }
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("clicking the help link")
    public void clicking_the_help_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Validating the help page opening")
    public void validating_the_help_page_opening() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
