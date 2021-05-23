package day6_testng_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class CybertekCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if (!checkBox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification Passed!");
        }else{
            System.out.println("Checkbox 1 is selected. Verification Failed!!!");
        }

        if (checkBox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification Passed!");
        }else{
            System.out.println("Checkbox 2 is not selected. Verification Failed");
        }

        Thread.sleep(2000);

        checkBox1.click();

        Thread.sleep(2000);
        checkBox2.click();

        if (checkBox1.isSelected()){
            System.out.println("Checkbox 1 is  selected. Verification Passed!");
        }else{
            System.out.println("Checkbox 1 is not selected. Verification Failed");
        }

        if (!checkBox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification Passed!");
        }else{
            System.out.println("Checkbox 2 is  selected. Verification Failed");
        }



    }
}
