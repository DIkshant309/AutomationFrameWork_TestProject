package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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







}
