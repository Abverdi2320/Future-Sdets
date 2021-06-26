package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class TechBlogWebsite {
    @BeforeMethod
    public void SetupLinks(){
        Driver.getDriver().get("https://techcrunch.com/");
    }
    @Test(priority = 1)
    public void TechCase1(){
        BrowserUtils.sleep(1);
        List<WebElement> allLatestNews =  Driver.getDriver().findElements(By.xpath("(//div[@class='content'])[3]"));
        List <WebElement> allauthor = Driver.getDriver().findElements(By.xpath("//a[@aria-label]"));
        List<WebElement> allimg = Driver.getDriver().findElements(By.xpath("//article//picture//img"));
        for(int i = 0; i < allLatestNews.size(); i++){
            for(int j = 0; j < allauthor.size(); j++){
            }
        }
        if(allLatestNews.contains(allauthor)){
            System.out.println("Each news has an author");
        }else{
            System.out.println("Each news doesn't have an author");
        }
        System.out.println("--------------------------------------------");
        if(allLatestNews.contains(allimg)){
            System.out.println("Each news has an image");
        }else{
            System.out.println("Each news doesn't have an image");
        }
    }
    @Test (priority = 2)
    public void TechCase2(){
        BrowserUtils.sleep(2);
        WebElement clickNews = Driver.getDriver().findElement(By.xpath("//a[.='Brave’s non-tracking search engine is now in beta']"));
        clickNews.click();
        String expectedTitle = "Brave’s non-tracking search engine is now in beta | TechCrunch";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test (priority = 3)
    public void TechCase3(){
        List <WebElement> Alllinks = Driver.getDriver().findElements(By.xpath("(//div[@class='content'])[3]//a"));
        for (WebElement eachLinks:Alllinks){
            //System.out.println("Alllinks sizes "+ eachLinks.getSize());
            System.out.println(eachLinks.getText());
        }
    }
}

