package FirstQustion;

import java.util.Arrays;
import java.util.Comparator;

public class Screen {
    public static void main(String[] arge){
        //生成5-20之间的随机数
        int count= (int) (5+Math.random()*(20-5));
        //System.out.println(count);
        //创建一个5-20之间的Integer的数组
        Integer[] array=new Integer[count];
        //System.out.println(array.length);
        for(int i=0;i<array.length;i++){
            //生成-3-7之间的随机数
            int temp=(int) ((-3)+Math.random()*(7-(-3)));
            //赋值给数组
            array[i]=temp;
            //System.out.print(array[i]+" ");
        }
        //创建一个新数组用来存储原来的数字，为了保持原数组不变
        Integer[] newArray=new Integer[count];
        for(int i=0;i<count;i++){
            newArray[i]=array[i];
        }
        //对先数组排序
        Arrays.sort(newArray, new CompareNum());

        System.out.println("排序前：");

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("排序后：");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }



    }
}
