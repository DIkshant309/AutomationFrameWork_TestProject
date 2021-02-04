package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pageFactory.SpiceJetHomepage;

import java.util.ArrayList;

import static Utility.Constant.SpiceJetURL;

public class LoginTestStep {
    WebDriver driver;
    public SpiceJetHomepage objSpiceJetHomepage;


    @Given("landing on the SpiceJet HomePage")
    public void landing_on_the_spice_jet_home_page() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver");
        driver = new ChromeDriver();
        driver.get(SpiceJetURL);
      //  driver.manage().window().fullscreen();
        String URL = driver.getCurrentUrl();

        Assert.assertEquals(SpiceJetURL, URL);

    }

    @When("^entering the (.*?) and the (.*?) information to get the rates$")
    public void entering_the_destination_and_the_arrival_information_to_get_the_rates(String dest, String arr) throws InterruptedException {
        objSpiceJetHomepage = new SpiceJetHomepage(driver);

        objSpiceJetHomepage.CLickOnHotelsTab();
        objSpiceJetHomepage.CLickOnFlightsTab();
        objSpiceJetHomepage.SelectDestinationCity(dest);
        objSpiceJetHomepage.SubmitButtonCLick();
        String color = objSpiceJetHomepage.ArrivalCity(arr);
        System.out.print(color);
      //  objSpiceJetHomepage.ClickingOnFlights("Covid 19 Information");
      //  driver.close();

    //    objSpiceJetHomepage.GetAddOnsListElemeents();
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();

        //a.moveToElement(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click().sendKeys(Keys.chord(Keys.ALT,Keys.ENTER));

        a.moveToElement(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click().build().perform();
      //  Thread.sleep(2000);
      //   a.moveToElement(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click().sendKeys(Keys.BACK_SPACE).build().perform();

       // driver.findElement(By.id("highlight-addons")).click();

    //   ArrayList<String> tab  = new  ArrayList<String> (driver.getWindowHandles());
    //   driver.switchTo().window(tab.get(3));


        driver.findElement(By.className("covid19")).click();
        Thread.sleep(5000);

    }

    @When("making the Assertions and validations for the information that was added")
    public void making_the_assertions_and_validations_for_the_information_that_was_added() {

    }

    @Then("on the results page the validations were made and the results were presented")
    public void on_the_results_page_the_validations_were_made_and_the_results_were_presented() {

    }



}
