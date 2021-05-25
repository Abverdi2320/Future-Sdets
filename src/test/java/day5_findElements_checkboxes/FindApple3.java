package day5_findElements_checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FindApple3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");
        String[] product = {"Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Support"};
        for (int i = 0; i < product.length; i++) {
            int positive = 0;
            int negative = 0;

            driver.findElement(By.xpath("//a[contains(@class,'" + product[i].toLowerCase() + "')]")).click();
            System.out.println(driver.getTitle());

            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            System.out.println("links are = " + product[i] + " = " + links.size());
            for (WebElement each : links) {
                if (each.getText().isEmpty()) {
                    positive++;
                } else {
                    negative++;
                }

            }
            System.out.println("links missing = " + positive);
            System.out.println("links with text = " + negative);
        }


    }

}
