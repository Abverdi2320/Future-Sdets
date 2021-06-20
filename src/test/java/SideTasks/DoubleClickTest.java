package SideTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class DoubleClickTest {
    /*
    TC #16: Double ClickTest
    1.Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    2.Switch to iframe.
    3.Double click on the text “Double-click me to change my text color.
    ”4.Assert: Text’s “style” attribute value contains “red”.
     */


    @Test
    public void test16(){
        //1 Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2 Switch to iframe.
        WebElement iframe = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);

        BrowserUtils.sleep(2);
        WebElement isfendiyar = Driver.getDriver().findElement(By.xpath("//p[.='Double-click me to change my text color.']"));
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(isfendiyar).doubleClick().perform();

        //Assert
        WebElement color = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));
        System.out.println(color.getText());
        Assert.assertTrue(color.isDisplayed());

        BrowserUtils.sleep(1);
        Driver.closeDriver();




    }
}
