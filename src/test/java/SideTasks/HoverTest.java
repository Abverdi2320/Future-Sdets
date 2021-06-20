package SideTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class HoverTest {

    /*
    TC #16: Hover Test
    1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    2.Drag and drop the small circle to bigger circle.
    3.Assert: -Text in big circle changed to: “You did great!”
     */

    @Test
    public void testingHover(){
        //go to url
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        WebElement message = Driver.getDriver().findElement(By.xpath("//div[.='You did great!']"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());

        BrowserUtils.sleep(1);
        Driver.closeDriver();





    }
}
