package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {
    WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void HandleSetUp(){
        String handleTitle = driver.getTitle();
        System.out.println("handleTitle = " + handleTitle);
        String expect = "Practice";
        String actual = handleTitle;
        Assert.assertEquals(expect,actual);

        WebElement element = driver.findElement(By.linkText("Click Here"));
        element.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current Title  = " + driver.getTitle());
        }
        String actualTitleAfterClick = driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

    }

}
