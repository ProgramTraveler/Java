package Ticket_1;

//定义一个类SellTicket实现Runnable接口，里面定义一个成员变量和重写run方法
public class SellTicket implements Runnable{

    private int ticket=100;

    //在SellTicket中重写run方法实现卖票
    @Override
    public void run() {
        //A.判断卖票数大于0，就卖票，并告知是哪个窗口卖的
        //B.卖了票以后，总票数要减一
        //C.票没有了，可能还会有人来问，所以这里使用死循环
       while (true){
           if(ticket>0){
               System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
               ticket--;
           }
       }


    }
}
