import java.awt.geom.Area;

class ComparableRectangle implements Comparable{
    private double len;
    private double wright;
    public ComparableRectangle(int len, int wright) {
        this.len = len;
        this.wright = wright;
    }
    public double calArea(){
        return len * wright;
    }

    @Override
    public String toString() {
        return "面积是：" + calArea();
    }
    @Override
    public int compareTo(Object o) {
        return new Double(calArea()).compareTo(((ComparableRectangle)o).calArea());
    }

}

public class TestInterface {

    public static void main(String[] arge){
            Comparable rec1 = new ComparableRectangle(2, 5);
            Comparable rec2 = new ComparableRectangle(4, 3);
            System.out.println((ComparableRectangle)Max.max(rec1, rec2));
    }

}
class Max{
    public static Comparable max(Comparable a, Comparable b){
        if(a.compareTo(b) > 0) //回调接口实现类的compareTo方法
            return a;
        else return b;
    }
}
