package day14_pom_synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class WebDriverWaitPractice {
    /*
    TC#40 : Dynamically Loaded Page Elements 7
1. Go to http://practice.cybertekschool.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert : Message “Done” is displayed.
4. Assert : Image is displayed.
Note: Follow POM
     */

    @Test
    public void dynamic_loading_7_test(){
       // 1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        //2. WAIT UNTIL TITLE IS "DYNAMIC TITLE"
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //use the object to wait for the explicit condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));



        //3.Assert: Message "Done" is displayed.
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.spongeBogImage));

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //4. Assert : Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBogImage.isDisplayed());
    }

    @Test
    public void dynamic_loading_1_test() {
        /*
        TC#41 : Dynamically Loaded Page Elements 1
1. Go to http://practice.cybertekschool.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert “Your password is invalid!” text is displayed.
Note: Follow POM Design Pattern
         */

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //2. Click to start
        dynamicLoad1Page.startButton.click();


        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        Assert.assertTrue(dynamicLoad1Page.inputPassword.isDisplayed());

        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");
        dynamicLoad1Page.inputPassword.sendKeys("crazyyy");
        dynamicLoad1Page.submitButton.click();

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());
        System.out.println(dynamicLoad1Page.errorMessage.getText());
    }

@AfterMethod
    public void tearDown(){
        Driver.closeDriver();
}







    }

