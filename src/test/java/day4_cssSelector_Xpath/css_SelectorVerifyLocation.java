package day4_cssSelector_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class css_SelectorVerifyLocation {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("Home is displayed: " +home.isDisplayed());
        WebElement forgotPassword = driver.findElement(By.tagName("h2"));
        System.out.println("Forgot password is displayed: "+ forgotPassword.isDisplayed());
        WebElement Email = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("Email word is displayed: " +Email.isDisplayed());
        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("Email input box is displayed: " +emailInput.isDisplayed());
        WebElement retrieveButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("Retrieve button is displayed: " +retrieveButton.isDisplayed());
        WebElement poweredByCyber = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("Powered by Cybertek School is displayed: "+poweredByCyber.isDisplayed());
    }
}
