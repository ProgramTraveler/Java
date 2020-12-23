import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyThread implements Runnable{
    private String[] gName = {"圆形","三角形","矩形","多边形"};
    private int[] gArea = {2,3,10,5};
    public Map<String,ArrayList<Geo>> m = new HashMap<>();
    Geo g =null;
    public MyThread(Geo o){
        this.g = o;
    }
    @Override
    public void run() {
        while (true) {
            //System.out.println(Thread.currentThread().getName());
            if (Thread.currentThread().getName() == "Inserter") {
                Random rN = new Random();
                Random rA = new Random();
                int tempN = rN.nextInt(4);
                int tempA = rA.nextInt(4);
                Geo o  = new Geo(gName[tempN],gArea[tempA]);
                g.Add(o);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else  {
                //System.out.println(g.A().size());
                for (int i = 0;i < g.A().size(); i ++) {
                    ArrayList<Geo> temp = m.get((g.A().get(i).GetName()));
                    if (temp != null) {
                        temp.add(g.A().get(i));
                    }else{
                        temp = new ArrayList<Geo>();
                        temp.add(g.A().get(i));
                    }
                    m.put((g.A().get(i)).GetName(),temp);
                    g.Remove(g.A().get(i));
                    System.out.println(m);
                }
            }
        }
    }
}
