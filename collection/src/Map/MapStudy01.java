package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapStudy01 {
/*   Map常用方法：
        V            get(Object key)   通过key获取value
        V            put(K key,V value)   向Map中添加键值对
        void         clear()   清空Map集合
        boolean      containsKey(Object key)    判断Map中是否包含某个key
        boolean      containsValue(Object value)  判断Map中是否包含某个value
        boolean      isEmpty()   判断集合是否为空
        set(Key)     keySet()      获取Map集合中所有的key
        Collection(V)   values()   获取Map集合中所有的value
        V            remove(Object key)  通过key删除键值对
        int          size()    获取键值对数量
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
    //通过get方法获取value
        String a=mymap.get(2);
        System.out.println("获取key为2的value:"+a);
    //查看键值对数量
        System.out.println("Map中键值对数量为"+mymap.size());
    //删除某个键值对
        mymap.remove(2);
    //判断是否包含某个key或value
        System.out.println(mymap.containsKey(4));
        System.out.println(mymap.containsValue("wangwu"));
    // 获取所有value值
        Collection<String> values=mymap.values();
        for (String s: values ) {
            System.out.println(s);
        }
    }
}
