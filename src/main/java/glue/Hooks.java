package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks {

public RemoteWebDriver driver;

    public RemoteWebDriver Browser (){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("version","87.0");
        caps.setCapability("screenResolution","780x720");
        caps.setCapability("name","scenario.getName()");
        caps.setCapability("javascriptEnabled","true");

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver");
        driver = new ChromeDriver(caps);

        return driver;
    }

}

