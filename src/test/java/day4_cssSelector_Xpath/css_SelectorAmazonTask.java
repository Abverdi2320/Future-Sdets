package day4_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverFactory;

public class css_SelectorAmazonTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Amazon Searchbox Title Verification Passed");
        }else{
            System.out.println("Amazon Searchbox Title Verification Failed!");
        }


    }
}
