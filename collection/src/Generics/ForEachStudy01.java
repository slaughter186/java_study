package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ForEachStudy01 {
    public static void main(String[] args) {
        List<String> mylist =new ArrayList<>();
        mylist.add("abc");
        mylist.add("a13");
        mylist.add("adsg");
        mylist.add("2dgc");
        Set<String> myset= new TreeSet<>();
        myset.add("abc");
        myset.add("Abc");
        myset.add("Fbc");
        myset.add("abc");
        myset.add("aWz");
        // 使用增强型foreach语句, 缺点是无法选择下标
        //语法 for (数据类型  变量名 ： 数值或集合名){}
        for (String s:mylist) {
            System.out.println(s);
        }
        for(String t:myset){
            System.out.println(t);
        }
    }
}
