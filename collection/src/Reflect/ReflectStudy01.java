package Reflect;

import java.lang.reflect.InvocationTargetException;

public class ReflectStudy01 {
    public static void main(String[] args)  {
        //第一种方法
        try {
            Class c1 = Class.forName("Reflect.user123");
            Object obj = c1.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //第二种方法
        String str="abc";
        Class x=str.getClass();
        //第三种方法
        user123 u =new user123();
        Class y=user123.class;

    }
}
class user123{
    int no;
    static {
        System.out.println("静态代码块执行");
    }

    public user123() {
       System.out.println("无参构造方法");
    }
}