package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {
            fis=new FileInputStream("D:\\尚硅谷大数据项目之电商数仓\\4.视频\\01_尚硅谷_数仓项目介绍.avi");
            byte[] bytes=new byte[1000];
            int readcount=0;
            while ((readcount=fis.read(bytes))!=-1){
               String a=new String(bytes,0,readcount);
               System.out.println(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null !=fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
