package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(how = How.ID, using = "email")
    WebElement email;
    @FindBy(how = How.ID, using = "pass")
    WebElement password;
    @FindBy(how = How.ID, using = "u_0_b")
    WebElement login;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email_container\"]/div[2]")
    WebElement error;
    @FindBy(how = How.XPATH, using = "//*[@id=\"u_0_a\"]/div[3]/a" )
    WebElement forgot;
    @FindBy(how = How.XPATH, using = "//*[@id=\"facebook\"]/body" )
    WebElement body;
    @FindBy(how = How.ID, using = "u_0_2" )
    WebElement Create_New;
    @FindBy(how = How.XPATH, using = "//*[@id=\"pageFooter\"]/ul/li[2]/a" )
    WebElement lang;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div/div/div[1]/h2" )
    WebElement fr;
    @FindBy(how = How.XPATH, using = "//*[@id=\"pageFooterChildren\"]/ul/li[32]/a" )
    WebElement help;
    @FindBy(how = How.XPATH, using = "//*[@id=\"js_1\"]/div/div/div[1]/a/div/div[2]/span" )
    WebElement help_output;


    public void EnterEmail(String abc)
    {
        email.sendKeys(abc);

    }
    public void EnterPassword(String pass)
    {
        password.sendKeys(pass);

    }
    public void login()
    {
        login.click();

    }

    public String error()
    {
        String er = error.getText();
return er;
    }

    public void forgot()
    {
        forgot.click();
    }

    public String body()
    {

       body.getText();
       String s =  body.getText();
       return s;
    }
    public void Create_new()
    {
     Create_New.click();


    }

    public void lang()
    {
        lang.click();
    }
    public String fr()
    {
        String french= fr.getText();
        return french;
    }

    public void help()
    {
    help.click();

    }
    public String help_output()
    {
        String output = help_output.getText();
        return output;
    }








}
