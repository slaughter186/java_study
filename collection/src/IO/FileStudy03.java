package IO;

import java.io.File;
import java.io.FileOutputStream;

public class FileStudy03 {
    public static void main(String[] args) {
        //listFiles方法把目录下面文件送入数组
        File f5 =new File("D:\\参考资料\\中科");
        File[] files =f5.listFiles();
        //遍历目录下的文件名
        for (File f:files) {
            System.out.println(f.getAbsoluteFile());
          }

    }
}
