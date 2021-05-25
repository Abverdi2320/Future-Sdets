package day6_testng_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SelectAstateTask {
    @Test
    public void case1() throws InterruptedException {
        /*
        TC #2: Selecting state from State dropdown and verifyingresult
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown
        3.Select Illinois
        4.Select Virginia
        5.Select California
        6.Verify final selected option is California.Use all Select options.(visible text, value, index)
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='state']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Illinois");
        select.selectByValue("VA");
        select.selectByIndex(5);
        dropdown.click();
        String expected = "California";
        String actual = select.getFirstSelectedOption().getText();
        if (actual.equals(expected)) {
            System.out.println("Verified");
        } else {
            System.out.println("Failed!");
        }
    }
}
