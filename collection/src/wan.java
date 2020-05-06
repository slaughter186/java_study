import java.util.*;

public class wan {
    int aa=100;
    public static void main(String[] args) {
       Students s1 =new Students(1,"fanhaolun");
       Students s2 =new Students(2,"zangling");
       Students s3 =new Students(3,"fanqing");

       Students[] studentslist = new Students[5];
        studentslist[0]=s1;
        studentslist[1]=s2;
        studentslist[2]=s3;
        List<Students> studentsArrayList= new ArrayList<>();
        studentsArrayList.add(s1);
        studentsArrayList.add(s2);
        studentsArrayList.add(s3);

        for (int i=0;i<studentslist.length;i++){
            if(null==studentslist[i]){
                break;
            }
            System.out.println(studentslist[i]);
       }
        System.out.println("=======================");
        Iterator<Students> it =studentsArrayList.iterator();
        while (it.hasNext()){
            Students next = it.next();
            System.out.println(next);


        }
    }
}
class Students{
    int no;
    String name;

    public Students(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}