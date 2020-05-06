package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IOandPropertiesStudy {
    public static void main(String[] args) throws IOException {
        FileReader rf1= new FileReader("passwd");
        Properties pro =new Properties();
        pro.load(rf1);
        String username=pro.getProperty("username");
        String password=pro.getProperty("password");
        System.out.println(username+":"+password);
    }
}
