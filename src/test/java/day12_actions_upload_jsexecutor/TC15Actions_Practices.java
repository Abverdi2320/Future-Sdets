package day12_actions_upload_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class TC15Actions_Practices {
    @Test
    public void tc15(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //Locating all of the images here:
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //We must create object of Actions class to be able to use methods coming from there

        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());

        //hover over to first image
        actions.moveToElement(image1).perform();

        //Assert:
        //user 1 is displayed
        Assert.assertTrue(user1.isDisplayed(),"User1 text is not displayed. FAIL!!!");

        BrowserUtils.sleep(2);

        actions.moveToElement(image2).perform();
        //Assert:
        //user 2 is displayed
        Assert.assertTrue(user2.isDisplayed(),"User1 text is not displayed. FAIL!!!");

        BrowserUtils.sleep(2);
        actions.moveToElement(image3).perform();
        //Assert:
        //user 3 is displayed
        Assert.assertTrue(user3.isDisplayed(),"User1 text is not displayed. FAIL!!!");


    }
}
