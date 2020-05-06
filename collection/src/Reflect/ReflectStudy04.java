package Reflect;

import java.lang.reflect.Method;

public class ReflectStudy04 {
    public static void main(String[] args) throws Exception {
        //获得UserLog对象
        Class userlog =Class.forName("Reflect.UserLog");
        Object userlogobj=userlog.getDeclaredConstructor().newInstance();
        //获取login方法
        Method loginMethod=userlog.getDeclaredMethod("login",String.class,String.class);
        //传参，获得方法返回值
        Object retValue=loginMethod.invoke(userlogobj,"root","123");
        System.out.println(retValue);
    }
}

class UserLog{
    public boolean login(String username,String password){
        if(username=="root"&& password=="123"){
            return true;
        }
        return false;
    }
}