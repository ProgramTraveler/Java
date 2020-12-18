package SecondQuestion;

public class Screen {
    public static void main(String[] arge){
        //想要生产CarA类型的车
        CarFactoryA A=new CarFactoryA();
        //想要生产CarB类型的车
        CarFactoryB B=new CarFactoryB();

        //查看CarA和CarB是否生产成功
        A.product().show();
        B.product().show();

    }
}
