package Ticket_2;

import Ticket_1.SellTicket;

public class SellTicketDemo_1 {
    public static void main(String[] arge){

        SellTicket_1 st=new SellTicket_1();

        Thread t1=new Thread(st,"窗口1");
        Thread t2 =new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
