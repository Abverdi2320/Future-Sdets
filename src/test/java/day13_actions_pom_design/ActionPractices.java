package day13_actions_pom_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class ActionPractices {
    @Test
    public void doubleClickTest(){
        //1 Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2 Switch to iframe.
        WebElement iframe = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.doubleClick(textToDoubleClick);
        actions.perform();

        String expectedInStyle = "red";
        String actualInStyle = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actualInStyle.contains(expectedInStyle));
    }
}
