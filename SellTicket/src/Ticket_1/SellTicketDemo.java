package Ticket_1;/*
需求：
    电影院共有100张票，有3个窗口卖票，设计一个程序模拟卖票
思路：
    1.定义一个类SellTicket实现Runnable接口，里面定义一个成员变量和重写run方法
    2.在SellTicket中重写run()方法实现卖票,代码步骤如下
        A.判断卖票数大于0，就卖票，并告知是哪个窗口卖的
        B.卖了票以后，总票数要减一
        C.票没有了，可能还会有人来问，所以这里使用死循环
    3.定义一个测试类，SellTicket，里面有main()方法
        A.创建SellTicket类的对象
        B.创建三个Thread的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        C.启动线程
*/

import Ticket_1.SellTicket;

public class SellTicketDemo {
    public static void main(String[] arge){
        //创建SellTicket类的对象
        SellTicket st=new SellTicket();

        //创建三个Thread的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1=new Thread(st,"窗口1");
        Thread t2 =new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
