package Reflect;

import java.util.ResourceBundle;

public class ResourcBundleTest {
    public static void main(String[] args) {
        //只能读取类路径下的properties后缀文件，并且路径里绝对不能写后缀名
        ResourceBundle rb= ResourceBundle.getBundle("Reflect/Reflect");
        String u=rb.getString("username");
        String p=rb.getString("password");
        System.out.println(u+":"+p);
    }
}
