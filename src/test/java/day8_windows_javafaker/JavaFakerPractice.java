package day8_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void Test1(){
        Faker faker = new Faker();

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
    }
}
