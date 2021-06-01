package day7_alets_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Alerts_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void information_alert_test() throws InterruptedException {
        WebElement informationAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlert.click();
        //Switching driver's focus to alert, so we can handle it
        Thread.sleep(2000);
        Alert ok = driver.switchTo().alert();

        //Click to OK button from the alert
        ok.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "You successfuly clicked an alert";
        String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed on the page.");

        Assert.assertEquals(expectedText,actualText,"Actual text is not as expected");


    }

    @Test
    public void ConfirmationAlertPractice() throws InterruptedException {

        WebElement informationAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlert.click();
        //Switching driver's focus to alert, so we can handle it
        Thread.sleep(2000);
        Alert ok = driver.switchTo().alert();

        //Click to OK button from the alert
        ok.accept();
    }
}
