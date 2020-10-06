package collection;

import java.util.Set;
import java.util.TreeSet;

//TreeSet的底层实现实际上是一个TreeMap
public class TestTreeSet {
    public static void main(String[] arge){
        Set<Integer> set=new TreeSet<>();

        set.add(300);
        set.add(200);
        set.add(600);
        //按照key递增的顺序排列
        for(Integer m:set){
            System.out.println(m);
        }

        Set<Employee_tree> set2=new TreeSet<>();
        set2.add(new Employee_tree(100,"二贺",3000));
        set2.add(new Employee_tree(110,"三贺",5000));
        set2.add(new Employee_tree(300,"四贺",4000));
        set2.add(new Employee_tree(700,"五贺",3000));
        //System.out.println(set2);
        for(Employee_tree m:set2){
            System.out.println(m);
        }
    }
}
