package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectStudy05 {
    public static void main(String[] args) throws Exception {
        //获得UserLog对象
        Class userlog1 =Class.forName("Reflect.UserLog1");
        //获取无参构造方法
        Object uobj=userlog1.getDeclaredConstructor().newInstance();
        System.out.println(uobj);
        //获取有参构造方法，首先要调取哪个有参构造方法
        Constructor con=userlog1.getDeclaredConstructor(int.class,String.class);
        //调用该构造方法，并new对象
        Object newcon=con.newInstance(20,"lunlun");
        System.out.println(newcon);
    }
}

class UserLog1{
    int no;
    String name;

    public UserLog1() {
    }

    public UserLog1(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserLog1{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}