package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadStudy01 {
    public static void main(String[] args) throws ParseException {
        Timer timer =new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2020-05-04 20:46:00");
        timer.schedule(new LogTimerTask(), firstTime,1000*3);

    }
}

class  LogTimerTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str =sdf.format(new Date());
        System.out.println(str+"执行一次备份");
    }
}
