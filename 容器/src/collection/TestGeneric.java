package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestGeneric {
    public static void main(String[] arge){
        //未加泛型
        /*Mycollection mc=new Mycollection();
        mc.set("abc",0);
        mc.set(888,1);
        //转型
        Integer a=(Integer)mc.get(1);
        String b=(String)mc.get(0);*/
        My_colllection<String> mc=new My_colllection<String>();
        mc.set("abc",0);
        String b=mc.get(0);
        //mc.set(888,1);

        List list=new ArrayList();
        Map map=new HashMap<>();


    }



}


//容器(未加泛型)
/*class Mycollection{
    Object[] objs=new Object[5];

    public void set(Object obj,int index){
        objs[index]=obj;
    }

    public Object get(int index){
        return objs[index];
    }
}*/
//容器（加泛型）<里面代表我们传进来的类型>
class My_colllection<E>{
    Object[] objs=new Object[5];

    public void set(E e,int index){
        objs[index]=e;
    }

    public E get(int index){
        return (E)objs[index];
    }

}
