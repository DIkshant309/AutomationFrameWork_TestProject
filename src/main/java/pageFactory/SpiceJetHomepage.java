package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SpiceJetHomepage {

    public SpiceJetHomepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.TAG_NAME,using = "a")
    List<WebElement> LinksOnHomepageSpiceJet;

    public void ClickingOnFlights(String Test){

        for (int i=0;i<LinksOnHomepageSpiceJet.size();i++){

            if(LinksOnHomepageSpiceJet.get(i).getText().equals(Test)){
                LinksOnHomepageSpiceJet.get(i).click();
                System.out.println(i);
            }

        }

    }


    @FindBy(how = How.CLASS_NAME,using = "book_flight")
    WebElement ClickFlightsTab;

    public void CLickOnFlightsTab(){
        ClickFlightsTab.click();
    }

    @FindBy(how = How.CLASS_NAME,using = "myspice_trip")
    WebElement ClickHotelsTab;

    public void CLickOnHotelsTab(){
        ClickHotelsTab.click();
    }

    @FindBy(how = How.ID,using = "ctl00_mainContent_ddl_originStation1_CTXT")
   WebElement SelectDestintipnCity;

    public void SelectDestinationCity(String destination) throws InterruptedException {
        Thread.sleep(2000);
        SelectDestintipnCity.clear();
        SelectDestintipnCity.sendKeys(destination);
    }

    @FindBy(how = How.ID,using = "ctl00_mainContent_ddl_destinationStation1_CTXT")
    WebElement ArrivalCity;

    public String ArrivalCity(String arr) {
        ArrivalCity.clear();
        ArrivalCity.sendKeys(arr);
        return  ArrivalCity.getCssValue("color");
    }

    @FindBy(how = How.ID,using = "ctl00_mainContent_btn_FindFlights")
    WebElement SubmitBtnCLick;

    public void SubmitButtonCLick() {
        SubmitBtnCLick.click();
    }

    @FindBy(how = How.ID,using = "ctl00$mainContent$DropDownListCurrency")
    WebElement CyrrencySelector;

    public void CurrencySelector() {
      Select s = new Select(CyrrencySelector);
      s.selectByValue("USD");
      s.selectByIndex(4);
      s.selectByVisibleText("USD");
    }


    @FindBy(how = How.ID,using = "highlight-addons")
    WebElement AddonsListelements;

    public void GetAddOnsListElemeents() throws InterruptedException {

        Thread.sleep(2000);
        AddonsListelements.click();

    }
}
