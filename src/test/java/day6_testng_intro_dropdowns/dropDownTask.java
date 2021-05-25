package day6_testng_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class dropDownTask {
    @Test
    public void verification() {
        /*
        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        1.Open Chrome browser
        2.Go to http://practice.cybertekschool.com/dropdown
        3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        4.Verify“State selection” default selected value is correctExpected: “Select a State”
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        String expected = "Please select an option";
        String actual = simpleDropdown.getText();
        if (actual.contains(expected)) {
            System.out.println("Dropdown Verification Passed!");
        } else {
            System.out.println("Dropdown Verification Failed!!");
        }
        WebElement stateSelection = driver.findElement(By.xpath("//select[@id='state']"));
        String expected2 = "Select a State";
        String actual2 = stateSelection.getText();
        if (actual2.contains(expected2)) {
            System.out.println("State selection passed");
        } else {
            System.out.println("State selection failed");
        }


    }
}

