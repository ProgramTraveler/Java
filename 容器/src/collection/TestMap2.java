package collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] arge){
        Employee e1=new Employee(1001,"peter",1500);
        Employee e2=new Employee(1002,"Alice",1800);
        Employee e3=new Employee(1003,"Tom",1200);
        //Employee e4=new Employee(1001,"no_peter",1700); //如果有重复，也会被覆盖

        Map<Integer,Employee> map=new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);

        //map.put(1001,e4);

        Employee e=map.get(1001);
        System.out.println(e.getName());
        System.out.println(map.get(1001));
    }

}

//雇员信息
class Employee{
    private int id;
    private String e_name;
    private double salary;

    public Employee(int id,String e_name,double salary){
        super();
        this.id=id;
        this.e_name=e_name;
    }

    public String getName(){
        return e_name;
    }

    public String toString(){
        return "id"+id+"name:"+e_name+"salary"+salary;
    }



}