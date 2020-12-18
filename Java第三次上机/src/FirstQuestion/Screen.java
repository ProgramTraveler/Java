package FirstQuestion;

import java.util.*;

import static java.util.Collections.sort;

public class Screen {
    public static void main(String[] arge){

        //创建一个容器，来存储NewGeometricObject对象
       List<NewGeometricObject> n=new ArrayList<NewGeometricObject>();
       //向容器里添加对象
       n.add(new NewCircle(1.0));
       n.add(new NewCircle(3.0));
       n.add(new NewTriangle(3.0,4.0,5.0));
       n.add(new NewTriangle(6.0,8.0,10.0));

       //两个不同图形进行面积比较，返回面积大的对象面积
       NewCircle c1=new NewCircle(1.0);
       NewTriangle t1=new NewTriangle(3.0,4.0,5.0);
       System.out.println("两个图形中面积大的：");
       System.out.println(((NewGeometricObject)(AreaComparator.max(c1,t1))).Area());
       //System.out .println(AreaComparator(new NewCircle(2),new NewTriangle(5,6,7)));
       //对容器里的对象进行排序（按面积）
       sort(n,new Comparator<NewGeometricObject>(){
           @Override
           public int compare(NewGeometricObject o1, NewGeometricObject o2) {
               return o1.compareTo(o2);
           }
       });
       System.out.println("所有图形的排序结果：");
       //输出最后的排序结果
       for(NewGeometricObject p:n){
           System.out.println(p.Area());
       }


    }
}
