package Reflect;

public class ArgsStudy {
    //可变参数
    public static void main(String[] args) {
        arg1();
        arg1("abc","abcd");
        arg2(true,1,20,30);
        arg2(true);
        arg3();
        arg3(32.2,232,232.323,3.24);
    }
    public static void arg1(String ... s){
    }
    public static void arg2(boolean b,int ... s){
    }
    public static void arg3(double ... s){
    }
}
