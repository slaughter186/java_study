package Reflect;

import java.io.IOException;
import java.io.InputStream;

public class AbsoluteStudy01 {
    //类路径下方式
    public static void main(String[] args) throws IOException {
       InputStream reader =Thread.currentThread().getContextClassLoader().
                getResourceAsStream("Reflect/Re.pro");
        byte[] bytes =new byte[1024];
        int readcount =0;
        reader.read(bytes);
        String a =new String(bytes);
        System.out.println(a);
    }
}
