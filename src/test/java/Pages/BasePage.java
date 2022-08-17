package Pages;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {


    private static ChromeDriver driver;

    @Before
public void setUp(){
    System.setProperty("webdriver.chrome.driver","./src/test/resources/chromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

    @After
    public void tearDown(){
       driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }

}
