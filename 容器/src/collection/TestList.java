package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//测试Collection接口中的方法
public class TestList {
    public static void main(String[] arge){
        /*
      Collection<String> c=new ArrayList<>();

      System.out.println(c.size());
      System.out.println(c.isEmpty());

      c.add("a");
      c.add("b");
      System.out.println(c);
      System.out.println(c.size());
      System.out.println(c.isEmpty());
      //是不是包含某一元素
      System.out.println(c.contains("a"));


      Object[] objs=c.toArray();
      System.out.println(objs);

      //把这个对象移出去，而不是删除它，只是移出这个容器，但这个对象还在（只是移出了容器里的地址）
      c.remove("a");
      System.out.println(c);

      //清空容器
      c.clear();
      System.out.println(c);
      */

      test02();
      test03();
    }

    public static void test01(){

    }

    public static void test02(){
        /*
        List<String> list01=new ArrayList<>();
        list01.add("aaa");
        list01.add("bbb");
        list01.add("ccc");

        List<String> list02=new ArrayList<>();
        list02.add("aaa");
        list02.add("bb");
        list02.add("dd");

        System.out.println(list02);

        //list01.addAll(list02); //把list02里所有的元素都加到list01里
        //list01.removeAll(list02); //把list01里和list02相同的元素移出
        list01.retainAll(list02); //把list01里和list02里相同的元素保留，其他元素移出

        System.out.println(list01);

        System.out.println(list01.containsAll(list02)); //list01里是否包含list02里的所有元素
        */
    }
    public static void test03(){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(0,"E"); //在零的位置插入E
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.set(2,"gao"); //把该位置的字符替换成gao
        System.out.println(list);

        System.out.println(list.get(2)); //返回该位置的数据

        list.add("A");
        list.add("D");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        System.out.println(list.indexOf("B")); //返回查找的元素第一次出现的位置，如果没有该元素则返回-1
        System.out.println(list.lastIndexOf("B")); //返回查找的元素最后一次出现的位置
    }

}
