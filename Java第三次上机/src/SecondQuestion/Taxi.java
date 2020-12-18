package SecondQuestion;

public class Taxi implements Pay{
    int km=0;
    public Taxi(int k){
        this.km=k;
    }
    @Override
    public void pay() {
        System.out.println("taxi:");
        if(km>3) System.out.println("the money is "+(km-3)/0.8+8);
        else System.out.println("the money is "+8);
    }
}
