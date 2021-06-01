package day7_alets_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
    @Test
    public void iframe_test(){
        //#1- Changing to iframe by index: we pass index number
       // driver.switchTo().frame(0)

        //#2- Locate as a Web Element to Switch
        //We find and locate <iframe> web element from the page
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        //driver.switchTo().frame(iframe);

        //#3- If <iframe> tag has id or name attribute, we can pass its attribute value as a string into
        //.switchTo().frame()method directly
        driver.switchTo().frame("mce_0_ifr");
        //LOCATING WEB ELEMENT TEXT
        WebElement yourContentGoesText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesText.isDisplayed());

        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
        //Locating header as web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));



    }


}
