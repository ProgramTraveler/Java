package TestTread_1;

public class TreadJoin extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
