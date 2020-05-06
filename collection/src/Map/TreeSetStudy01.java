package Map;

import java.util.TreeSet;
/*
生成一个程序，将顾客信息放入TreeSet里，需要重写比较方法
1、顾客类必须implements Comparable,注意，必须用泛型，否则只能
引入Object
2、必须设置变量和设置有参构造方法。
3、必须重写compareTo方法，本例是年龄升序，如果年龄一致，姓名再升序
4、重写toString方法，否则输出是内存地址
 */
public class TreeSetStudy01 {
    public static void main(String[] args) {
        TreeSet<Custom> customs= new TreeSet<>();
        customs.add(new Custom(20,"zhangsan"));
        customs.add(new Custom(18,"lisan"));
        customs.add(new Custom(20,"zangsan"));
        customs.add(new Custom(21,"wangsan"));
        for (Custom c:customs) {
            System.out.println(c);
        }
    }
}
class Custom implements Comparable<Custom>{
    int age;
    String name;

    public Custom(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Custom c) {
        if(this.age==c.age){
            return this.name.compareTo(c.name);
        }else{
            return this.age-c.age;
        }
    }
}