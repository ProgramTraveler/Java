import java.awt.event.ActionListener;
import java.util.ArrayList;
public  class Geo {

    private String name;
    private int Area;
    private volatile ArrayList<Geo> G;

    public Geo(){
        G = new ArrayList<Geo>();
    }
    public Geo(String n,int a) {
        name = n;
        Area = a;
    }
    public String GetName() {
        return name;
    }
    synchronized ArrayList<Geo> A() {
        return G;
    }
    synchronized void Add(Geo o) {
        //System.out.println("添加");
        G.add(o);
    }
    synchronized void Remove(Geo o) {
        //System.out.println("移除");
        G.remove(o);
    }
    synchronized int N() {
        return G.size();
    }
    public String toString(){
        return  String.valueOf(Area);

    }



}
