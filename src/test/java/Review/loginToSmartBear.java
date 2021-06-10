package Review;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BrowserUtils;

public class loginToSmartBear {
    WebDriver driver;

    public static void FakerObject(WebDriver driver) {


        WebElement selectfamily = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select anyselect = new Select(selectfamily);
        anyselect.selectByValue("FamilyAlbum");

        WebElement QTY = driver.findElement(By.xpath("//input[@type='text']"));
        QTY.sendKeys("2");

        WebElement calcu = driver.findElement(By.xpath("//input[@type='submit']"));
        calcu.click();


        Faker faker = new Faker();
        String name = faker.name().name();
        System.out.println("name = " + name);

        String street = faker.address().streetAddress();
        System.out.println("street = " + street);

        String city = faker.address().city();
        System.out.println("city = " + city);

        String state = faker.address().state();
        System.out.println("state = " + state);

        String zipcode = faker.address().zipCode().replace("-", "");
        System.out.println("zipcode = " + zipcode);

        WebElement customername = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        customername.sendKeys(name);

        WebElement customerstr = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        customerstr.sendKeys(street);

        WebElement customercity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        customercity.sendKeys(city);

        WebElement customerstate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        customerstate.sendKeys(state);

        WebElement customerzipcode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        customerzipcode.sendKeys("22150");

        WebElement radioVisa = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        radioVisa.click();

        String cardfaker = faker.finance().creditCard().replace("-", "");
        System.out.println("cardfaker = " + cardfaker);

        WebElement cardNumber = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        cardNumber.sendKeys(cardfaker);

        WebElement expiry = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        expiry.sendKeys("11/25");

        WebElement process = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        process.click();

        WebElement locaGetText = driver.findElement(By.xpath("//strong"));
        String expected = "New order has been successfully added.";
        String actual = locaGetText.getText();

        Assert.assertEquals(expected, actual);
    }

    public static void onlyLogin(WebDriver driver) {
        WebElement username = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement clickOrder = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        clickOrder.click();
        BrowserUtils.sleep(2);
    }

    public static void clickallorder(WebDriver driver) {
        WebElement viewwebElement = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewwebElement.click();


        WebElement susan = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl06_OrderSelector']"));
        susan.click();

        WebElement susanverify = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr[6]/td[5]"));
        String expected = "“01/05/2010";
        String actual = susanverify.getText();

        Assert.assertEquals(actual, expected);

    }
}

