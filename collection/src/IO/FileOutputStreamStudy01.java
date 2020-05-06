package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamStudy01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //以下方法是将b文件清空，再导入
            fos= new FileOutputStream("d:/b.txt");
            //以下方法是将b文件追加
            //fos= new FileOutputStream("d:/b.txt",true);
            byte[] bytes= {97,98,99,100};
            fos.write(bytes);
            //输出流必须加flush方法
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null!=fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
