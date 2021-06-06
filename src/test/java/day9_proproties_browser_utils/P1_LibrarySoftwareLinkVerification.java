package day9_proproties_browser_utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.LibraryUtils;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_LibrarySoftwareLinkVerification {
    /*
    1.Open browser
    2.Go to website: http://library2.cybertekschool.com/login.html
    3.Enter username: “”
    4.Enter password: “”
    5.Click to Login button
    6.Print out count of all the links on landing page
    7.Print out each link text on this page
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }




    @Test
    public void login_link_count_test(){
     //loginMethod calling to login Library App
        LibraryUtils.loginToLibrary(driver);

        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks = " + allLinks.size());
        for (WebElement each : allLinks) {
            System.out.println(each.getText());

        }



    }
}