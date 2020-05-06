package collection;
import java.util.*;

public class CollectionStudy01 {
    public static void main(String[] args) {
       /*首先创建List对象，List特有的方法（除了继承Collection接口的）：
         viod       add（int index,Object element) 指定位置添加元素
         Object     remove（int index)  删除指定位置元素
         Object     get（int index)  获取指定位置的元素
         Object     set（int index,Object element) 更改指定位置元素
         int        indexOf(Object o)   获取元素出现的第一个位置
         int        lastIndexOf(Object o)   获取元素出现的最后一个位置
        */
        List  myList = new ArrayList();
        //添加元素,传统方法默认顺序添加
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("A");
        myList.add("E");


        //用list特有方法在第二个位置添加
        myList.add(1,"插入到第二个位置");
        //获取第三个位置元素
        Object b3=myList.get(2);
        System.out.println(b3+"是list里第三个元素");
        //获取A出现的第一个位置和最后一个位置
        System.out.println("A首次出现位置下标："+myList.indexOf("A"));
        System.out.println("A最后出线位置下标："+myList.lastIndexOf("A"));
        //获取迭代器，遍历
        System.out.println("====================================");
        Iterator it= myList.iterator();
        while (it.hasNext()){
            Object elt =it.next();
            System.out.println(elt);
        }
        System.out.println("====================================");
        //把第二个位置元素改了
        myList.set(1,"第二个元素改了");
        Iterator it2 =myList.iterator();
        while (it2.hasNext()){
            Object elt =it2.next();
            System.out.println(elt);
        }
        //ArrayList是非安全的，以下工具能够把他变成线程安全的
        Collections.synchronizedList(myList);
    }
}
