package TestTread_1;

public class TreadDaemonDemo {
    public static void main(String[] arge){
        TreadDaemon td1=new TreadDaemon();
        TreadDaemon td2=new TreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程，当主线程结束时，守护线程随后会马上停掉
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }


    }
}
