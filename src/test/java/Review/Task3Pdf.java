package Review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task3Pdf {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.className("gb_g")).click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Verification Successfully Passed!");
        } else {
            System.out.println("Title Verification Failed!!");
        }
        driver.navigate().back();
        String newExpectedTitle = "Google";
        String newActualTitle = driver.getTitle();
        if (newActualTitle.equals(newExpectedTitle)) {
            System.out.println("New Title Verification Passed!");
        } else {
            System.out.println("New Title Verification Failed!!");
        }


    }
}
