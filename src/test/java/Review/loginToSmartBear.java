package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginToSmartBear {
    public static void driver(WebDriver driver){
        WebElement username = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

}
