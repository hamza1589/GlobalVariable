package GlobalVariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("src/test/java/data.properties");
        prop.load(file);
       String a= prop.getProperty("Browser");
        System.out.println(a);
        prop.getProperty("URL");
        System.out.println(prop.getProperty("URL"));
        prop.setProperty("Browser","FireFox");
        System.out.println(prop.setProperty("Browser","FireFox"));
        FileOutputStream fos=new FileOutputStream("src/test/java/data.properties");
        prop.store(fos,null);


    }
}
