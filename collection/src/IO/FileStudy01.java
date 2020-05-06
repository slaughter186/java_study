package IO;

import java.io.File;
import java.io.IOException;

public class FileStudy01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\abc");
        //查看f1是否存在,如果不存在则建立文件
        if (!f1.exists()) {
            // 建立文件
            f1.createNewFile();
            //还可以建立目录
            // f1.mkdir();
        File f2 = new File("D:\\a\\b\\c");
            //查看f2是否存s在,如果不存在则建立多级目录
        if (!f2.exists()) {
            // 建立多级目录
             f2.mkdirs();
            }
       }
    }
}
