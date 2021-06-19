package day12_actions_upload_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class UploadPractice {
    @Test
    public void upload_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //Find some small file from ur computer, and get the path of it.
        String path = "/Users/a-boss/Desktop/dawn-morning-seoul-old-town-wallpaper-preview.jpeg";

        //3.Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(3);

        //Sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        //Assert
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());
        //Click to uploadButton

        uploadButton.click();
    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }


}
