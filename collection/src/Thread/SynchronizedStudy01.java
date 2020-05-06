package Thread;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;

public class SynchronizedStudy01 {
    public static void main(String[] args) {
        Account ac = new Account(2001, 10000);
        Account bc = new Account(2001, 10000);

        Thread t1 = new AcountThread(ac);
        Thread t2 = new AcountThread(bc);
        t1.setName("fan");
        t2.setName("zang");
        t1.start();
        t2.start();
    }
}

class Account {
    private int no;
    private double money;

    public Account() {
    }

    public Account(int no, double money) {
        this.no = no;
        this.money = money;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double cunqian(double m) {

        double aftermoney = getMoney() + m;
        setMoney(aftermoney);
        return aftermoney;

    }

    public double quqian(double m) {
        synchronized ("abc") {
            double aftermoney = getMoney() - m;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(aftermoney);
            System.out.println("m = " + m);

            return aftermoney;
            
            
        }

    }
}

class AcountThread extends Thread {
    private Account account;

    public AcountThread(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double a = account.quqian(1000);
            if (a < 1000) {

                System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "次取钱,没钱了");
                return;
            }
            System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "次取钱，剩余金额" + a + "元");
        }
    }
}