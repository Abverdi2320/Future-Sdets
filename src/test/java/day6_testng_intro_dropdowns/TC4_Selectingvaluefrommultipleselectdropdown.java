package day6_testng_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4_Selectingvaluefrommultipleselectdropdown {
    WebDriver driver;
    /*
    TC #4: Selecting value from multiple select dropdown
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Select all the options from multiple select dropdown.
    4.Print out all selected values.
    5.Deselect all values.
     */

    @BeforeClass
    public void setDriver(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void setUrl(){
        driver.get("http://practice.cybertekschool.com/dropdown");
                driver.manage().window().maximize();
    }
    @Test (priority = 1)
    public void test1(){
        WebElement allLang = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select first = new Select(allLang);
        for (int i = 0; i < 5; i++) {
            first.selectByIndex(i);

        }
        List<WebElement>list = first.getAllSelectedOptions();
        for (WebElement each : list) {

        }
        first.deselectAll();
    }
    @AfterClass
    public void closingBrowser(){
        driver.close();
    }
}
