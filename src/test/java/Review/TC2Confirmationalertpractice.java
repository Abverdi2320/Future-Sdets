package Review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC2Confirmationalertpractice {
    /*

1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed.
     */

    WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void setTest() throws InterruptedException {
        WebElement jsConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsConfirm.click();

        Thread.sleep(2000);

        Alert okAlert = driver.switchTo().alert();
        okAlert.accept();

        WebElement verify = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedVerify ="You clicked: Ok";
        String actualVerify = verify.getText();

        System.out.println(verify.isDisplayed());
    }

}
