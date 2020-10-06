package collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] arge){
        Map<Integer,String> treemap1=new TreeMap<>();
        treemap1.put(20,"aa");
        treemap1.put(3,"bb");
        treemap1.put(6,"cc");

        //TreeMap按照key递增的方式排序
        for(Integer key:treemap1.keySet()){
            System.out.println(key+"....."+treemap1.get(key));
        }

        //会按照下面的定义的Comparable的方式递增
        Map<Employee_tree,String> treemap2=new TreeMap<>();
        treemap2.put(new Employee_tree(100,"二贺",5000),"good pig");
        treemap2.put(new Employee_tree(150,"三贺",3000),"bad pig");
        treemap2.put(new Employee_tree(202,"四贺",8000),"fat pig");
        treemap2.put(new Employee_tree(254,"五贺",8000),"too fat pig");

        for(Employee_tree key:treemap2.keySet()){
            System.out.println(key+"....."+treemap2.get(key));
        }


    }
}

//接口
class Employee_tree implements Comparable<Employee_tree>{
    int id;
    String name;
    double salary;

    public Employee_tree(int id,String name, double salary){
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    //重写toString，按以下的方式显示
    public String toString(){
       return "id:"+id+" name:"+name+" salary:"+salary;
    }
    @Override
    public int compareTo(Employee_tree o) { //负数：小于，0：等于，正数：大于
        //按salary的方式递增，如果salary相等就去比较id的大小
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else {
            if(this.id>o.id){
                return 1;
            }
            else if(this.id>o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }
}


