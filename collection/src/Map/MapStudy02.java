
package Map;

        import java.util.*;

public class MapStudy02 {
/*   Map遍历的方法：
        V            get(Object key)   通过key获取value
        set(Key)     keySet()      获取Map集合中所有的key
        Collection(V)   values()   获取Map集合中所有的value
        set<Map.Entry(K,V)>   entrySet()  将Map集合转换成Set集合
 */

    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> mymap = new HashMap<>();
        //写入键值对
        mymap.put(1,"zhangsan");
        mymap.put(2,"lisi");
        mymap.put(3,"wangwu");
        mymap.put(4,"zhaoliu");
        mymap.put(5,"luomi");
        //第一种方法：先获取key，放入Set集合
        Set<Integer> keys = mymap.keySet();
        //通过迭代器遍历
        System.out.println("===============第一种迭代器方法================");
        Iterator<Integer> it=keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = mymap.get(key);
            System.out.println(key + "=" + value);
        }
        //通过foreach进行遍历
        System.out.println("===============第一种foreach方法================");
            for (Integer key2:keys) {
                String  value2= mymap.get(key2);
                System.out.println(key2 + "="+value2);
            }
        //第二个方法：通过entrySet方法
        System.out.println("===============第二种entrySet方法================");
        Set<Map.Entry<Integer,String>> entrySet = mymap.entrySet();
        for (Map.Entry<Integer,String> node: entrySet) {
            System.out.println(node.getKey() + "="+node.getValue());
        }    
    }
}
