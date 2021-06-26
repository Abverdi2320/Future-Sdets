package day13_actions_pom_design;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LibraryLoginPage;
import utilities.Driver;

public class PageObjectModelPractices {
    @Test
    public void negative_login_to_library(){
        //1- Go to library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        //Create object of the class
        //When we create the object of "LibraryLoginPage", constructor will automatically
        //initialize driver and object of LibraryLoginPage
        //Meaning we will be able to use the selenium method through the object of the class.
        LibraryLoginPage loginPage = new LibraryLoginPage();



        //2- Enter incorrect username
        loginPage.inputEmail.sendKeys("crazyfrog@gmail.com");

        //3- Enter incorrect password
        loginPage.inputPassword.sendKeys("wrongPassword");

        //4-Click to sign in button
        loginPage.signInButton.click();

        //5-Verify error message is displayed
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());


    }
}
