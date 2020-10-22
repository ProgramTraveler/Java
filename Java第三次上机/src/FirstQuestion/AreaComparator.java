package FirstQuestion;

public class AreaComparator {

    public static Comparable max(Comparable o1,Comparable o2){

        if(o1.compareTo(o2) > 0) //回调接口实现类的compareTo方法
            return o1;

        else return o2;
    }
}
