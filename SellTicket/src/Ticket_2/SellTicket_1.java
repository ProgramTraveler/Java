package Ticket_2;

public class SellTicket_1 implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        /*
        //相同票出现多次
        //出现负数（t1继续拥有执行权，然后ticket--，ticket=0，然后t2获得执行权执行ticket--，就变成了负数）
        //两个问题出现的原因就是因为线程的随机性导致的
        while (true){
            //ticket=100
            //t1,t2,t3
            //假设t1抢到CPU的执行权
            if(ticket>0){
                //通过sleep()方法模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100毫秒
                    //t2线程抢到CPU的执行权，t2线程就开始执行，执行到这里，也会休息100毫秒
                    //t3线程抢到CPU的执行权，t3线程就开始执行，执行到这里，也会休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按顺序醒过来
                //t1抢到CPU的执行权，在控制台输出正在出售第100张票
                System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
                //t2抢到CPU的执行权，在控制台输出正在出售第100张票
                //t2抢到CPU的执行权，在控制台输出正在出售第100张票
                ticket--;
                //如果这三个线程按顺序来，就会执行三次ticket--操作，最终票就变成了97
            }
        }
        */



    }
}
