import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.OfficeHoursUtils;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class RealJobTask2Adidas {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");
    }
    public void productAdder(String category, String product){
        driver.findElement(By.xpath("//a[.='"+category+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='"+product+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
    }

    @Test
    public void adidasTest(){
        // Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart".
        OfficeHoursUtils.productAdder(driver,"Laptops","Sony vaio i5");
        OfficeHoursUtils.productAdder(driver, "Phones","Samsung galaxy s6");
        OfficeHoursUtils.productAdder(driver,  "Monitors","Apple monitor 24");

        //Remove Apple Monitor 24
        OfficeHoursUtils.productRemover(driver,"Apple monitor 24");

        driver.findElement(By.xpath("//button[.='Place Order']")).click();

        Faker faker = new Faker();
        driver.findElement(By.id("name")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("country")).sendKeys(faker.country().name());
        driver.findElement(By.id("city")).sendKeys(faker.country().capital());
        driver.findElement(By.id("card")).sendKeys(faker.finance().creditCard());
        driver.findElement(By.id("month")).sendKeys(String.valueOf(faker.number().numberBetween(1,12)));
        driver.findElement(By.id("yea")).sendKeys(String.valueOf(faker.number().numberBetween(2022,2030)));
        driver.findElement(By.xpath("//button[.='Purchase']")).click();
        BrowserUtils.sleep(1);
        String confirmation = driver.findElement(By.xpath("//p[@class='lead text-muted']")).getText();
        System.out.println("confirmation = " + confirmation);





    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
