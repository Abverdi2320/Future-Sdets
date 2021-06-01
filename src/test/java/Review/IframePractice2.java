package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice2 {
    WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void setUpIframe(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement element = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(element.isDisplayed());

        driver.switchTo().parentFrame();
        WebElement element2 = driver.findElement(By.xpath("//h3"));
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        String actual = element2.getText();
        Assert.assertTrue(element2.isDisplayed());

    }

}
