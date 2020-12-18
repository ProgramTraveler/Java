package SecondQuestion;

public class Screen {
    public static void main(String[] arge){

        Cinema c1=new Cinema(0,false);
        Parking p1=new Parking(16);
        Taxi t1=new Taxi(8);

        c1.pay();
        p1.pay();
        t1.pay();

    }
}
