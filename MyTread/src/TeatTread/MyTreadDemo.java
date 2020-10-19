package TeatTread;

import javax.xml.transform.TransformerException;

public class MyTreadDemo {
    public static void main(String[] arge){
        //创建MyTread的对象
        MyTread my1=new MyTread();
        MyTread my2=new MyTread();

        //启动线程


        /*直接调用run方法并不会启动多线程
        my1.run();
        my2.run();*/

        //通过setName()的方法来线程设置名称
        my1.setName("first");
        my2.setName("second");

        /*也可以直接给线程取名，但前提是要在类有带参的构造方法
        MyTread my3=new MyTread("third");
        */

        //返回此线程的优先级
        //线程默认的优先级默认为5
        //System.out.println(my1.getPriority());
        //System.out.println(my2.getPriority());

        //设置线程的优先级
        //my1.setPriority(10000); //超出了线程优先级的范围
        //查看优先级的范围
        //System.out.println(Thread.MIN_PRIORITY+"-"+Thread.MAX_PRIORITY);

        //设置正确的优先级(优先级高只是表示它获取的线程的几率高)
        my1.setPriority(1);
        my2.setPriority(10);

        //应该调用start方法，void start()导致线程开始执行，java虚拟机调用此线程的run方法
        my1.start();
        my2.start();

        //static Tread currentThread() 返回当前正在执行的线程对象的引用,通过线程对象来调用getName返回名称
        //System.out.println(MyTread.currentThread().getName());
    }


}
