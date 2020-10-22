package TestTread_1;

import static java.lang.Thread.sleep;

public class TreadSleep extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);

            //每次执行一次，停一秒,
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
