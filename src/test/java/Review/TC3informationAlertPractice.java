package Review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC3informationAlertPractice {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        element.click();

        Alert text = driver.switchTo().alert();
        text.sendKeys("hello");
        Thread.sleep(2000);
        text.accept();

        WebElement verification = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedRes = "You entered: hello";
        String actualRes = verification.getText();
        System.out.println(verification.isDisplayed());




    }
}
