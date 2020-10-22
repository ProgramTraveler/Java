package TestTread_1;

public class TreadJoinDemo {
    public static void main(String[] arge){
        TreadJoin tj1=new TreadJoin();
        TreadJoin tj2=new TreadJoin();
        TreadJoin tj3=new TreadJoin();

        tj1.setName("大阿哥");
        tj2.setName("三阿哥");
        tj3.setName("五阿哥");

        tj1.start();
        //当tj1的线程执行完后，后面的线程才有机会执行
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();
    }
}
