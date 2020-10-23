package TestRunnable;

import com.sun.security.jgss.GSSUtil;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            //这里不直接用getName的原因是没有继承Tread类，不能直接使用
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
