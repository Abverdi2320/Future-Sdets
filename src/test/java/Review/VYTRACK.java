package Review;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class VYTRACK {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }

    @Test(priority = 1)
    public void navigateVytrack() throws InterruptedException {
        String title = driver.getTitle();

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("user178");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);

        String expTitle = "Dashboard";
        String actTitle = driver.getTitle();
        System.out.println("actTitle = " + actTitle);
        Thread.sleep(3000);

        WebElement fleetTest = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetTest.click();


        WebElement vehicle = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        vehicle.click();


        WebElement generalInfo = driver.findElement(By.xpath("//td[.='Cyberte']"));
        generalInfo.click();


        WebElement element = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
        element.click();

        Thread.sleep(2000);
        WebElement keyword = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        keyword.sendKeys("CyberTruck");

        WebElement save = driver.findElement(By.xpath("//button[.='Save']"));
        save.click();

        Thread.sleep(1000);

        WebElement activityTab = driver.findElement(By.xpath("//a[.='Activity']"));
        activityTab.click();

        Thread.sleep(2000);

        WebElement drp = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        drp.click();

        Thread.sleep(1000);

        WebElement config = driver.findElement(By.xpath("//a[.='My Configuration']"));
        config.click();

        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='localization[oro_locale___locale][use_parent_scope_value]']"));
        checkbox.click();

        Thread.sleep(2000);
        WebElement locale = driver.findElement(By.xpath("//select[@name='localization[oro_locale___locale][value]']"));
        locale.click();


       Thread.sleep(2000);
       Select country = new Select(locale);
       country.selectByVisibleText("Azerbaijani (Azerbaijan)");
       locale.click();

       Thread.sleep(1000);
       WebElement saveSettings = driver.findElement(By.xpath("//button[@type='submit']"));
       saveSettings.click();

       Thread.sleep(1000);
       WebElement resetSettings = driver.findElement(By.xpath("//button[@type='reset']"));
       resetSettings.click();


       Thread.sleep(1000);
       WebElement ok = driver.findElement(By.xpath("//a[@class='btn ok btn-primary']"));
       ok.click();

        Thread.sleep(1000);
        WebElement saveItAgain = driver.findElement(By.xpath("//button[@type='submit']"));
        saveItAgain.click();




    }

}