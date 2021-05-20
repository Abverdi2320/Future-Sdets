package day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask4_ValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");


        //locating the "create a page" link
        WebElement createPageLin = driver.findElement(By.linkText("Create a Page"));


        String expectedInHref = "registration_form";
        String actualHrefValue = createPageLin.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("HREF value verification Passed!");
        }else{
            System.out.println("HREF value Failed!!");
        }

    }
}
