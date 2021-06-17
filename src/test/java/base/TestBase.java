package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
  public   WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : https://practice.cybertekschool.com/tables#edit\
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
