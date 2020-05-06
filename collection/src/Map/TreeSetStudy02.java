package Map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStudy02 {
    public static void main(String[] args) {
        /*
        生成一个内部匿名类 Comparator 比较器对象，然后重写该比较器对象，都要用
        泛型。
         */
        TreeSet<Custom1>  custom1s = new TreeSet<>(new Comparator<Custom1>() {
            @Override
            public int compare(Custom1 o1, Custom1 o2) {
                    return o1.age-o2.age;
            }
        });
        custom1s.add(new Custom1(20,"zssangsan"));
        custom1s.add(new Custom1(21,"zhangsan"));
        custom1s.add(new Custom1(20,"zangsan"));
        custom1s.add(new Custom1(22,"wangsan"));
        for (Custom1 c:custom1s) {
            System.out.println(c);
        }

    }
}

class Custom1 {
    int age;
    String name;

    public Custom1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Custom1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}