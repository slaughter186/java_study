package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStudy01 {
    public static void main(String[] args)  {
        ObjectInputStream in1= null;
        try {
            in1 = new ObjectInputStream(new FileInputStream("abcd"));
            //必须要用强转，否则编译不过去，readObject出来的是Objcet对象
            List<Student> lists= (List<Student>) in1.readObject();
            for (Student s:lists) {
               System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
    }

