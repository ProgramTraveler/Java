import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Screen {
    public static void main(String[] arge){
        Museum20 mus=new Museum20();
        ArrayList<Integer> M_arr=new ArrayList<>();
        Museum20 mus1=new Museum20(50,"春夏");
        Museum20 mus2=new Museum20(10,"春夏");
        Museum20 mus3=new Museum20(30,"秋冬");
        Museum20 mus4=new Museum20(5,"秋冬");
        M_arr.add(mus1.money);
        M_arr.add(mus2.money);
        M_arr.add(mus3.money);
        M_arr.add(mus4.money);
        Collections.sort(M_arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Museum20:"+"营业额排序");
        for(int i=0;i<4;i++){
            System.out.print(M_arr.get(i)+" ");
        }
        System.out.println();
        Gym gym1=new Gym(10);
        Gym gym2=new Gym(5);
        Gym gym3=new Gym(8);
        ArrayList<Integer> G_arr=new ArrayList<>();
        G_arr.add(gym1.money);
        G_arr.add(gym2.money);
        G_arr.add(gym3.money);
        Collections.sort(G_arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Gym:"+"营业额排序");
        for(int i=0;i<3;i++){
            System.out.print(G_arr.get(i)+" ");
        }


    }
}
