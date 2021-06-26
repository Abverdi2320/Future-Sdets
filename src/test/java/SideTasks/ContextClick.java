package SideTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class ContextClick {
    /*
    TC #17: Context Click –HOMEWORK
    1.Go to https://the-internet.herokuapp.com/context_menu
    2.Right click to the box.
    3.Alert will open.
    4.Accept alert No assertion needed for this practice.
     */

    @Test
    public void Test17(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement rightClick = Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClick).perform();

        BrowserUtils.sleep(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
}
