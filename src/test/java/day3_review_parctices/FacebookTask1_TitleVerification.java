package day3_review_parctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1_TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC :1Facebook incorrect login title verification
        1.Open Chrome browser
        2.Go to https://www.facebook.com
        3.Enter incorrect username
        4.Enter incorrect password
        5.Verify title changed to: Expected: “Log into Facebook”
         */
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        //Locating the web element using id locator and storing it in WebElement type
        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("Crazyfrog@gmail.com");


        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("CrazyFrog124" + Keys.ENTER);

        String expectedTitle = "Log into Facebook";
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification Successful!" +actualTitle);
        }else{
            System.out.println("Verification Failed!!");
        }


    }
}
