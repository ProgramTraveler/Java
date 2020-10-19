package TeatTread;

//继承Thread类
public class MyTread extends Thread {
    //无参构造方法
    public MyTread(){}
    //带参构造方法（Tread类中的）
    public MyTread(String name){
        super(name); //访问父类中带参构造方法

    }

    //重写run放发
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
