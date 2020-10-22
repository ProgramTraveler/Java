package SecondQuestion;

public class Charges implements Pay{
    @Override
    public void cinema(int num, boolean vip) {
        System.out.println("cinema:");
        if(num==0){
            if(vip==false) System.out.println("the money is "+(50));
            else System.out.println("the money is "+(50/2));
        }
        if(num==1){
            if(vip==false) System.out.println("the money is "+30);
            else System.out.println("the money is "+(30/2));
        }
        if(num==2){
            if(vip==false)System.out.println("the money is "+100);
            else System.out.println("the money is "+(100/2));
        }
    }

    @Override
    public void taxi(int km) {
        System.out.println("taxi:");
        if(km>3) System.out.println("the money is "+(km-3)/0.8+8);
        else System.out.println("the money is "+8);
    }

    @Override
    public void parking(int hour) {
        System.out.println("parking:");
        if(hour>20) System.out.println("the money is "+(hour-20)*10+(20-8)*4);
        else System.out.println("the money is "+(hour-8)*4);
    }
}
