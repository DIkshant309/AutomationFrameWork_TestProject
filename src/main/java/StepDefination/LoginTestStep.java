package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import pageFactory.SpiceJetHomepage;

import static Utility.Constant.SpiceJetURL;

public class LoginTestStep {
    WebDriver driver;
    public SpiceJetHomepage objSpiceJetHomepage;


    @Given("landing on the SpiceJet HomePage")
    public void landing_on_the_spice_jet_home_page() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver");
        driver = new ChromeDriver();
        driver.get(SpiceJetURL);

        driver.manage().window().fullscreen();
        String URL = driver.getCurrentUrl();

        Assert.assertEquals(SpiceJetURL, URL);

    }

    @When("entering the destination and the arrival information to get the rates")
    public void entering_the_destination_and_the_arrival_information_to_get_the_rates() throws InterruptedException {
        objSpiceJetHomepage = new SpiceJetHomepage(driver);

        objSpiceJetHomepage.CLickOnHotelsTab();
        Thread.sleep(2000);
        objSpiceJetHomepage.CLickOnFlightsTab();
        objSpiceJetHomepage.SelectDestinationCity("Delhi");
        objSpiceJetHomepage.SubmitButtonCLick();
        String color = objSpiceJetHomepage.ArrivalCityGetCSS();
        System.out.print(color);
      //  objSpiceJetHomepage.ClickingOnFlights("Covid 19 Information");

    }

    @When("making the Assertions and validations for the information that was added")
    public void making_the_assertions_and_validations_for_the_information_that_was_added() {

    }

    @Then("on the results page the validations were made and the results were presented")
    public void on_the_results_page_the_validations_were_made_and_the_results_were_presented() {

    }



}
