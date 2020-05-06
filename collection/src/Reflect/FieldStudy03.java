package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class FieldStudy03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 =Class.forName("java.lang.String");
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(c1.getModifiers())+" class "+c1.getSimpleName()+"{\n");

        //c1.getDeclaredMethods();是把所有方法放入Method数组
        Method[] methods = c1.getDeclaredMethods();
        for(Method m:methods){
            s.append("\t");
            s.append(Modifier.toString(m.getModifiers()));
            s.append(" ");
            //获得方法返回类型getType
            s.append(m.getReturnType().getSimpleName());
            s.append(" ");
            s.append(m.getName());
            s.append("(");
            //参数在这里,先把参数获取完放入数组
            Class[] parameterTypes =m.getParameterTypes();
            for (Class parameterType:parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            s.deleteCharAt(s.length()-1);
            s.append("){}\n");
        }
        s.append("\n}");
        System.out.println(s);
    }
}