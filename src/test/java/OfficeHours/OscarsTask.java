package OfficeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class OscarsTask {
    /*
    1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
2. The user logs in with the user "username" and the password "password"
3. The user navigates to Account Activity page
4. Then The page should have the title "Zero - Account Activity"
5. Then Account drop down should have the following options :
(Savings, Checking, Savings, Loan, Credit Card, Brokerage)
6. Brokerage option should have "No results."

     */
    WebDriver driver;

    @BeforeClass
    public void setUps(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");
    }
    @Test
    public void TC1(){
        WebElement username = driver.findElement(By.cssSelector("[id*='user_login']"));
        username.sendKeys("username");

        WebElement password = driver.findElement(By.cssSelector("[id*='user_password']"));
        password.sendKeys("password");

        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();


    }
}
