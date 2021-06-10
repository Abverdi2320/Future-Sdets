package day10_webtable_properties_review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("browser");

        String url = ConfigurationReader.getProperty("dataTablesUrl");
        //This line returns String : https://practice.cybertekschool.com/tables#edit\

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        //Below code is same as above
       //driver.get(ConfigurationReader.getProperty("dataTablesUrls"));
    }

    @Test
    public void test3_return_tims_due_amount() {

        ////table[@id='table1']//td[.='Tim'] --> this locator locates Tim's cell regardless
        // of which row he is in
        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult,expectedTimResult,"Tim's cell is not returning as expected.");
    }
}
