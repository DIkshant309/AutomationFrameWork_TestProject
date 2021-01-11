package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage;

public class Language_Change {

    public LoginPage lang;
    WebDriver driver;

    @Given("Landing on the facebook website")
    public void landing_on_the_facebook_website() {

        System.setProperty("webdriver.chrome.driver", "D:\\Ideal projects\\AutomationFrameWork_TestProject\\Drivers\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        lang = new LoginPage(driver);
      lang.lang();
        String french =lang.fr();
      System.out.println(french);
      if(french.contains("vous permet de rester en contact avec les personnes qui comptent dans"))
      {
          System.out.println("test is pass");

      }
      else {
          System.out.println("Test is faild");
        }



        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Changing the language of the page")
    public void changing_the_language_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("validating that the language is changed")
    public void validating_that_the_language_is_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
