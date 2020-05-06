package Reflect;

import java.lang.reflect.Field;

public class FieldStudy02 {
    public static void main(String[] args) throws Exception {
        Class c2= Class.forName("Reflect.User2");
        Object obju2 =c2.getDeclaredConstructor().newInstance();
        //获取no这个field
        Field fieldno =c2.getDeclaredField("no");
        Field fieldname =c2.getDeclaredField("name");
        Field fieldsex =c2.getDeclaredField("sex");
        Field fieldaddress =c2.getDeclaredField("address");
        Field fieldcountry =c2.getDeclaredField("COUNTRY");

        //在obju2这个对象的no赋给20
        //set是赋值，get是取值
        fieldno.set(obju2,20);
        fieldname.set(obju2,"lunlun");
        fieldsex.set(obju2,true);
        fieldaddress.setAccessible(true);
        fieldcountry.setAccessible(true);
        fieldaddress.set(obju2,"天津市");
        System.out.println(fieldno.get(obju2));
        System.out.println(fieldname.get(obju2));
        System.out.println(fieldsex.get(obju2));
        System.out.println(fieldaddress.get(obju2));
        System.out.println(fieldcountry.get(obju2));

    }
}

class User2{
    public int no;
    protected String name;
    boolean sex;
    private String address;
    private static final String COUNTRY="CHINA";
}