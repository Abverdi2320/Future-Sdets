package day5_findElements_checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class findElementsApple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");
        WebElement clickIphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        clickIphone.click();
        List<WebElement> allList = driver.findElements(By.xpath("//a"));
        int missingText = 0;
        int linkHasText = 0;
        int totalLink = allList.size();

        for (WebElement each : allList) {
            if (each.getText().isEmpty()){

                missingText++;
            }else {
                linkHasText++;
            }
            System.out.println("Text of all links = " +each.getText());
        }
        System.out.println();
        System.out.println("Missing text = " +missingText);
        System.out.println("Links with text = " +linkHasText);
        System.out.println("Total links = " +totalLink);

    }
}
