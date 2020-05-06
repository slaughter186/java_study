package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsStudy01 {
    public static void main(String[] args) {
     //泛型语法,List<数据类型>，集合中只能存入Animal类型数据
        List<Animal> myList =new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
        //报错  myList.add("abc");
        //取出迭代器,也要泛型模式
        Iterator<Animal> it= myList.iterator();
        while(it.hasNext()){
            //这时候就不用必须Object了，可以用Animal了
            Animal a=it.next();
            System.out.println(a);
        }
        for (Animal data: myList) {
            System.out.println(data);

        }
    }
}


class  Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class  Cat extends Animal{
    public void catchmouse(){
        System.out.println("猫在捉老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞");
    }
}