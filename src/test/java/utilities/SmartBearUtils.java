package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {
    public static void verifyOrder(WebDriver driver){


        List<WebElement>list = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));

        for (WebElement each : list) {
            System.out.println(each.getText());
            if (each.getText().equals(list)){
                Assert.assertTrue(each.getText().equals(list));
            }
        }
    }


}
