package Review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4Pdf {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Verification Passed Successfully!");
        }else{
            System.out.println("Title Verification Failed!!");
        }
    }
}
