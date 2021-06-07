package day9_proproties_browser_utils;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void readingFromPropertiesFile() throws IOException {
        //#1- Create object of Properties class (Coming from Java library)

        Properties properties = new Properties();

        //#2- Open the file using FileInputStream
        //We are trying to open a file, so we need to pass the path.
        FileInputStream file = new FileInputStream("configuration.properties");

        //#3- load the properties object with our file
        properties.load(file);

        //reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }

    
    @Test
    public void using_properties_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));

    }
}
