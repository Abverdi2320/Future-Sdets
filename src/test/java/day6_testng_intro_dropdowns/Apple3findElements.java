package day6_testng_intro_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Apple3findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/");

        //Storing 9 web elements including "apple" logo, and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for (int i = 1; i < headerLinks.size()-1; i++) {
           // System.out.println(headerLinks.get(i).getText());
            headerLinks.get(i).click();
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            //print out the titles of  each page
            System.out.println("Current title in the page: " + driver.getTitle());


            // print out total number of links in page
            List<WebElement>allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total Number of links in current page: " +allLinks.size());
            int linksWithNoText = 0;
            int linksWithText = 0;
            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()){
                    linksWithNoText++;
                }else {
                    linksWithText++;
                }
            }
            System.out.println("linksWithText = " + linksWithText);
            System.out.println("linksWithNoText = " + linksWithNoText);
        }
    }
}
