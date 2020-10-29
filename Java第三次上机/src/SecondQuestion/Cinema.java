package SecondQuestion;

public class Cinema implements Pay{
    int num=0;
    boolean vip=false;
    public Cinema(int n,boolean v){
        this.num=n;
        this.vip=v;
    }
    @Override
    public void pay() {
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
}
