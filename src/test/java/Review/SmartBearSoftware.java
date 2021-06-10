package Review;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtils;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SmartBearSoftware {
    /*
    1.Open browser
    2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3.Enter username: “Tester”
    4.Enter password: “test”
    5.Click on Login button
    6.Click on Order
    7.Select familyAlbum from product, set quantity to 2
    8.Click to “Calculate” button
    9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
    10.Click on “visa” radio button
    11.Generate card number using JavaFaker
    12.Click on “Process”
    13.Verify success message “New order has been successfully added.”
     */
    WebDriver driver;

    @BeforeClass
    public void Setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @BeforeMethod
    public void login(){
        loginToSmartBear.onlyLogin(driver);
    }


    @Test (priority = 1)
    public void test1() {
        loginToSmartBear.FakerObject(driver);
    }


    @Test(priority = 2)
    public void verifyOrder(){
        SmartBearUtils.verifyOrder(driver);
    }





}






