package SecondQuestion;

public class Parking implements Pay{
    int hour=0;
    public Parking(int h){
        this.hour=h;
    }
    @Override
    public void pay() {
        System.out.println("parking:");
        if(hour>20) System.out.println("the money is "+(hour-20)*10+(20-8)*4);
        else System.out.println("the money is "+(hour-8)*4);
    }
}
