package FirstQustion;

import java.util.Comparator;

public class CompareNum implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {

        int num1=Integer.parseInt(o1.toString());
        int num2=Integer.parseInt(o2.toString());

        //重写compare方法
        if(num1*num1>num2*num2){

            return  -1;
        }else{

            return 1;
        }

    }
}
