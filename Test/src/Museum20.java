public class Museum20 implements Profit{
    //接待人数
    private int Num_people=0;
    //在不同时间的门票价格
    private int price=0;
    //营业额
    public int money=0;
    @Override
    public void getTurnout() {
        //money=Num_people*price;
        System.out.println("营业额为"+money);
    }
    public Museum20(){
        System.out.println("类名："+"Museum20"+"-"+"班级："+"计算机1802班");
    }
    public Museum20(int num,String mon){
        Num_people=num;
        if(mon=="春夏") price=200;
        else price=150;
        //计算当前营业额
        money=Num_people*price;

    }
}
