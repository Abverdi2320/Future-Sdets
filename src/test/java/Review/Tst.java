package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tst {
    WebDriver driver;

    @BeforeClass
    public void Setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void tst2(){

        WebElement username = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement viewwebElement = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewwebElement.click();



        List<WebElement> list = driver.findElements(By.xpath("//table[@class='SampleTable']//tbody//td[2]"));

        for (WebElement each : list) {
            System.out.println(each.getText());
            if (each.getText().equals(list)){
                Assert.assertTrue(each.getText().equals(list));
            }
        }


    }
}
