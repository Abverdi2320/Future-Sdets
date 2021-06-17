package day10_webtable_properties_review;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TableUtils;

public class Table_Tasks extends TestBase {
    @Test
    public void test3_return_tims_due_amount() {
        //Below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTablesUrls"));
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        ////table[@id='table1']//td[.='Tim'] --> this locator locates Tim's cell regardless
        // of which row he is in
        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]
        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tim's cell is not returning as expected.");
    }

    @Test
    public void task4_verify_order_method() {
        TableUtils.verifyOrder(driver, "Tim");
    }

    @Test
    public void task5_print_all_names_and_emails() {
        TableUtils.printNamesAndEmails(driver);
    }
}
