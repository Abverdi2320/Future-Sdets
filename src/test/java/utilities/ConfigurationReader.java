package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
We will create a re-usable method that will be reading from configuration.reader file
 */

public class ConfigurationReader {

    //#1- Create properties object
    private static Properties properties = new Properties();

    static {
        //#2- Load the file into FileInputStream
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- load properties object with the file(configuration.properties)
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {

            System.out.println("File not found in Configuration properties.");
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty("keyword");
    }


}
