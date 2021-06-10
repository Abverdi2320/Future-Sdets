package Review;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task3 {
    WebDriver driver;

    @BeforeClass
    public void SetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test(priority = 1)
    public void tc3() throws InterruptedException {
        loginToSmartBear.onlyLogin(driver);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void clickAllOrders(){
        loginToSmartBear.clickallorder(driver);
    }

}
