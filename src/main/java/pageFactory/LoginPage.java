package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(how = How.CLASS_NAME, using = "get-started___1iELy button___1cs1R")
    WebElement email;

    @FindBy(how = How.TAG_NAME, using = "button")
    List<WebElement> email1;
    //classname = no spaces allowed ; error compound classes not allowed
    //alphanumeric classes : avoid using anywhere ; Xpath , Classname alone

    @FindBy(how = How.ID, using = "pass")
    WebElement password;
    @FindBy(how = How.ID, using = "u_0_i")
    WebElement login;


    @FindBy(how = How.XPATH, using = "//*[href='https://www.empire.ca/privacy-policy']")
    WebElement footer;


    public void EnterEmail()
    {

        footer.click();

 //       for(int i=0;i<footer.size();i++){
     //       if (footer.get(i).getText().contains("Legal")){

      //      }
      //  }
    }
    public void EnterPassword()
    {
        List<WebElement> email2 = null;
        email2 = new ArrayList<>();
        int x=0;
        for(int i=0;i<email1.size();i++){

          if (email1.get(i).getText().contains("Get Started")){

              email2.add(email1.get(i));
         }
    }
        System.out.println(email2.size());
        email2.get(1).click();
    }
    public void login()
    {
        login.click();

    }







}
