package TestRunnable;

public class MyRunnableDemo {
    public static void main(String[] arge){
        //创建MyRunnable类的对象
        MyRunnable my=new MyRunnable();

        //创建一个Thread类的对象，把MyRunnable对象作为够造方法的参数
        //Thread(Runnable target)
        //Thread t1=new Thread(my);
        //Thread t2=new Thread(my);

        //Thread(Runnable target,String name)
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");
        //启动线程
        t1.start();
        t2.start();



    }

}
