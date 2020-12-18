public class Gym implements Profit{
    //每日租用的时间
    private int hour=0;
    //营业额
    public int money=0;
    @Override
    public void getTurnout() {
        money=hour*120;
        System.out.println("营业额为"+money);
    }
    public Gym(int h){
        hour=h;
        //计算当前营业额
        money=hour*120;
    }

}
