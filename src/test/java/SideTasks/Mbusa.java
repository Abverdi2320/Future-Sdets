package SideTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class Mbusa {
    @Test(priority = 1)
    public void setUp(){
        Driver.getDriver().get("https://www.mbusa.com/en/home");

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//button[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(1);

        WebElement sedansWagons = Driver.getDriver().findElement(By.xpath("//button[@class='global-header__menu-l3-tab-button']"));
        sedansWagons.click();

        WebElement models = Driver.getDriver().findElement(By.xpath("//button[@aria-controls='global-header__item-models-cta-1-3']"));
        models.click();

        WebElement build = Driver.getDriver().findElement(By.xpath("//a[@href='/en/vehicles/build/s-class/sedan/s580v4/lines']"));
        build.click();
    }

    @Test(priority = 2)
    public void setUpContinue(){
        WebElement executive = Driver.getDriver().findElement(By.xpath("//a[.='Start Build']"));
        executive.click();

        BrowserUtils.sleep(1);

        WebElement startExploring = Driver.getDriver().findElement(By.xpath("//button[.='Start Exploring']"));
        startExploring.click();

        BrowserUtils.sleep(1);

        WebElement whiteColor = Driver.getDriver().findElement(By.xpath("//button[@id='option-swatch-2:799']"));
        whiteColor.click();

        BrowserUtils.sleep(1);
        WebElement wheels = Driver.getDriver().findElement(By.xpath("//button[@id='option-swatch-0:60R']"));
        wheels.click();

        BrowserUtils.sleep(2);
        WebElement next = Driver.getDriver().findElement(By.xpath("//button[@class='button button_primary mbs-build-steps__cta']"));
        next.click();

        Driver.getDriver().findElement(By.xpath("//button[@id='option-swatch-4:504']")).click();

        BrowserUtils.sleep(1);

        Driver.getDriver().findElement(By.xpath("//button[.='Make Changes']")).click();

        BrowserUtils.sleep(1);

        Driver.getDriver().findElement(By.xpath("//button[@id='option-swatch-0:H17']")).click();
    }
    @Test(priority = 3)
    public void setUpContinue2(){
        BrowserUtils.sleep(1);
        WebElement next2 = Driver.getDriver().findElement(By.xpath("//button[@class='button button_primary mbs-build-steps__cta']"));
        next2.click();

        BrowserUtils.sleep(1);

        WebElement next3 = Driver.getDriver().findElement(By.xpath("//button[@class='button button_primary mbs-build-steps__cta']"));
        next2.click();

        Driver.getDriver().findElement(By.xpath("//button[@id='contact-dealer']")).click();

        WebElement zipCode = Driver.getDriver().findElement(By.xpath("//input[@class='form__input-field form__input-field--can-reset']"));
        zipCode.sendKeys("11214");
//
//        WebElement element = Driver.getDriver().findElement(By.xpath("//input[@class='form__input-field form__input-field--can-reset']"));
//        Faker faker = new Faker();
//        faker.name().firstName();


    }
}
