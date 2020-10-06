package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Set的操作和List差不多，但Set，没有顺序，不可重复，而List有顺序可重复
//Set相当于Map的键值（所以不能重复），基于Map的操作
public class TestSet {
    public static void main(String[] arge){
        Set<String> set1 = new HashSet<>();
        //Set里不可重复
        set1.add("aa");
        set1.add("bb");
        set1.add("aa");
        System.out.println(set1);

        set1.remove("bb");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("cc");
        set2.add("dd");

        set2.addAll(set1);
        System.out.println(set2);
    }
}
