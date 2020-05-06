package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldStudy01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 =Class.forName("java.lang.StringBuilder");
        StringBuilder s = new StringBuilder();
        //c1.getModifiers()  获得修饰符，但是以数字输出，所以必须还要放入静态方法
        //Modifier.toString()中转换成字符
        //c1.getSimpleName()获得类名  ，c1.getName()获得完整类名
        s.append(Modifier.toString(c1.getModifiers())+" class "+c1.getSimpleName()+"{");

        //c1.getDeclaredFields();是把所有变量放入Field数组
        // c1.getFields();只是把public变量放入Field数组
        Field[] fields = c1.getDeclaredFields();
        for(Field f:fields){
            s.append("\n");
            s.append(Modifier.toString(f.getModifiers()));
            s.append(" ");
            //获得数据类型getType
            s.append(f.getType().getSimpleName());
            s.append(" ");
            s.append(f.getName());
          }
            s.append("\n}");
        System.out.println(s);
    }
}

class User{
    public int no;
    protected String name;
    boolean sex;
    private String address;
    public static final String COUNTRY="CHINA";

}