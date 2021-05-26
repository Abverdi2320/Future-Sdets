package day6_testng_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Selectingdateondropdownanverifying {
    @Test
    public void TC3() {
        /*
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown
        3.Select “December 1st, 1922” and verify
        it is selected.Select year using: visible textSelect month using
        : value attributeSelect day using: index number
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement date = driver.findElement(By.xpath("//select[@id='year']"));
        date.click();
        Select year = new Select(date);
        year.selectByVisibleText("1922");
        date.click();


        WebElement date2 = driver.findElement(By.xpath("//select[@id='month']"));
        date2.click();
        Select month = new Select(date2);
        month.selectByValue("11");
        date2.click();


        WebElement date3 = driver.findElement(By.xpath("//select[@id='day']"));
        date3.click();
        Select day = new Select(date3);
        day.selectByIndex(0);
        date3.click();

        String expected = "December 1st, 1922";
        boolean actual = date.isSelected();
        boolean actual1 = date2.isSelected();
        boolean actual2 = date3.isSelected();






    }
}
