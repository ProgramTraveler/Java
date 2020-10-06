package collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
  public static void main(String[] arge){
      Map<Integer,String> m1=new HashMap<>();

      m1.put(1,"one");
      m1.put(2,"tow");
      m1.put(3,"three");

      System.out.println(m1.get(1));

      System.out.println(m1.size());//获得m1里面键值对的数量
      System.out.println(m1.isEmpty()); //判断m1是否为空
      System.out.println(m1.containsKey(1)); //判断m1里是否有键值1
      System.out.println(m1.containsValue("four")); //判断m1里是否有four这个value

      Map<Integer,String> m2=new HashMap<>();
      m2.put(4,"four");
      m2.put(5,"five");

      m1.putAll(m2); //把m2的键值对传进m1
      System.out.println(m1);

      //map里的键不能重复(是否重复根据equals()方法来判断)
      m1.put(3,"三"); //新的键值对会把老的覆盖
      System.out.println(m1);


  }
}
