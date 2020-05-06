package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy02 {
    public static void main(String[] args) {
        File f3 =new File("D:\\参考资料\\中科\\工具软件测试.docx");
        //查看文件名
        System.out.println(f3.getName());
        //查看绝对路径
        System.out.println(f3.getAbsolutePath());
        //判断是否是个文件还是个目录
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
        //获取最后修改时间
        long haomiao=f3.lastModified();
        Date time =new Date(haomiao);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime=sdf.format(time);
        System.out.println(strTime);
        //查看文件大小
        System.out.println(f3.length());


    }
}
