package Reflect;

public class ReflectStudy06 {

    public static void main(String[] args) throws Exception {
        @Deprecated
        Class c1= Class.forName("java.lang.String");
        //获得父类
        Class c1superclass=c1.getSuperclass();
        System.out.println("String类的继承父类为："+c1superclass.getSimpleName());
        //获得实现的接口
        Class[] c1Interfaces = c1.getInterfaces();
        for (Class c1interface:c1Interfaces) {
            System.out.println("String类实现了以下接口："+c1interface.getSimpleName());
        }




    }
}
