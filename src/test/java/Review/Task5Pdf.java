package Review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5Pdf {
    public static void main(String[] args) {
        /*
        TC#5: Basic login authentication1-Open a chrome browser
        2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx3-Verify title equals:Expected:
         Web Orders Login4-Enter username: Tester5-Enter password: test6-Click “Sign In” button7-Verify titleequals:Expected: Web Orders
         */


       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       String expectedTitle = "Web Orders Login";
       String actualTitle = driver.getTitle();
       if (actualTitle.equals(expectedTitle)){
           System.out.println("Verify Successful!");
       }else{
           System.out.println("Verify Failed!!");
       }

       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("crazyfrog");
       driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("crazyfrog123");
       driver.findElement(By.id("ctl00_MainContent_login_button")).click();

       String expectedTitle2 = "Web Orders";
       String actualTitle2= driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Verify Successful!");
        }else{
            System.out.println("Verify Failed!!");
        }





    }
}
