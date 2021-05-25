package day6_testng_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setupClass(){
        System.out.println("------> Before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("------> After Class is running");

    }


    @BeforeMethod
    public void setup_method(){
        System.out.println("------> Before method is running ");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("------> After method is running");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Running test1...");
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);



    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Running test 2...");
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));

    }
}
