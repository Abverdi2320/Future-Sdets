package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;
/*
1.Open browser
2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3.Enter username: “Tester”
4.Enter password: “test”
5.Click to Login button
6.Print out count of all the links on landing page
7.Print out each link text on this pageMini-
 */

public class Smartbearsoftwarelinkverification {
    WebDriver driver;

    @BeforeClass
    public void SetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void tearDown(){
        loginToSmartBear.driver(driver);


        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println(allLinks.size());
        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }
    }


}
