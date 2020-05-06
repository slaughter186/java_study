package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStudy01 {
    public static void main(String[] args)  {
        //建立对象
        Student s1 = new Student(1,30, "Zhangsan");
        Student s2 = new Student(2,21, "Lisi");
        Student s3 = new Student(3,20, "Wangwu");
        Student s4 = new Student(4,27, "Liugang");
        //建立集合
        List<Student> lists = new ArrayList<>();
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        lists.add(s4);

        ObjectOutputStream o1 = null;
        try {
         //新建对象流 ，文件名abcd
            o1 = new ObjectOutputStream(new FileOutputStream("abcd"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
        //将四个学生信息序列化到文件
            o1.writeObject(lists);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            o1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            o1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


class Student implements Serializable {
    private int no;
    private int age;
    private transient String name;
    //固定序列号
    private static final long serialVersionUID= 1L;

    public Student(int no, int age, String name) {
        this.no = no;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}