package day5_findElements_checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class PO4_Cybertek_Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com/");
        List<WebElement> list = driver.findElements(By.xpath("//body//a"));
        int positive = 0;
        int negative = 0;
        int total = list.size();
        for (WebElement each : list) {
            if (each.getText().isEmpty()){
                positive++;
            }else{
                negative++;
            }
        }

        System.out.println("Missing link text = " + positive);
        System.out.println("Links with text = " + negative);
        System.out.println("Total links = " + total);



    }
}
