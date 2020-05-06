package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamStudy01 {
    public static void main(String[] args) {
        logger.log("用户名已经登陆");
        logger.log("用户已经更改密码");
        logger.log("日志记录开始记录第一个行为");
        logger.log("用户名已经退出登录");
    }
}

class logger{
    public static void log(String msg) {
        try {
            //指向日志文件
            PrintStream out = new PrintStream(new FileOutputStream("D:/log.txt",true));
            //改变输出方向，默认是控制台，现在改成向log.txt输出
            System.setOut(out);

            Date nowtime =new Date();
            System.out.println(nowtime+":"+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}