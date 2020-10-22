package TestTread_1;

public class TreadSleepDemo {
    public static void main(String[] arge){
        TreadSleep ts1=new TreadSleep();
        TreadSleep ts2=new TreadSleep();
        TreadSleep ts3=new TreadSleep();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
