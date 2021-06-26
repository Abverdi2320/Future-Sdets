package Review;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class Vytrack_Assginment_5_Object {
    @Test(priority = 1)
    public void Vytrack_Login() {
        //1- go to https://qa3.vytrack.com/user/login
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        Vytrack_Assignment_5 login = new Vytrack_Assignment_5();
        login.usernameInput.sendKeys("User177");
        login.passwordInput.sendKeys("UserUser123");
        login.submitButton.click();
    }

    @Test(priority = 2)
    public void test_Grid() {
        Vytrack_Assignment_5 grid = new Vytrack_Assignment_5();
        grid.fleet.click();
        BrowserUtils.sleep(1);
        grid.vehicle.click();
        grid.gridButtonClickable.click();

        System.out.println(grid.gridButtonClickable.getText());
        Assert.assertTrue(grid.gridButtonClickable.isEnabled());






    }
}
