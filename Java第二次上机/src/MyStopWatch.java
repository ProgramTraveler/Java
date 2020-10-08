import java.util.*;

import static java.lang.Thread.sleep;

public class MyStopWatch {
    private double startTime = -1; //表示计时器启动（默认值为-1）
    private double stopTime = -1; //表示计时器停止时间（默认值为-1）

    private double temp_time = 0.0; //记录暂停时刻和开始时间的时间段（默认为0.0）

    private int runningState = 0; //当前运行状态（0-3，默认为0）
    private int splitState = 5; //当前是否分段（4或5，默认5）
    private ArrayList<Double> split_time = new ArrayList<>(); //记录分段时间里的每个时间

    //0：未启动，1：启动，2：停止，3：暂停，4：分段计时，5：取消分段

    //开始计时
    public void start() {
        if (runningState == 0) {
            System.out.println("开始计时：");
            runningState = 1;
            startTime = System.currentTimeMillis();
        } else {
            return;
        }
    }

    //结束计时
    public void stop() {
        //在任何状态应该都能强行结束
        System.out.println("结束计时：");
        runningState = 2;
        stopTime = System.currentTimeMillis();

    }

    //暂停计时
    public void suspend() {
        if (runningState == 1) {
            System.out.println("时间已经暂停：");
            runningState = 3;
            temp_time = System.currentTimeMillis() - startTime;// 记录从暂停这个时刻和开始之间的时间

            startTime = 0.0; //将开始时间置0

        } else {
            return;
        }
    }

    //从暂停状态开始计时
    public void resume() {
        if (runningState == 3) {
            System.out.println("从暂停状态开始计时：");
            runningState = 1;
            startTime = System.currentTimeMillis(); //按当前时间开始
        } else {
            return;
        }
    }

    //分段计时
    public void split() {
        if (runningState == 1) {
            System.out.println("已分段计时：");
            splitState = 4; //分段状态
            double temp = (System.currentTimeMillis() - startTime)/1000.0;
            //System.out.println(temp);
            split_time.add(temp);
        } else {
            return;
        }
    }

    //结束分段计时
    public void un_split() {
        if (splitState == 4) {
            System.out.println("取消分段计时：");
            splitState = 5; //取消分段状态
            split_time.clear(); //清空记录的临时分段数据
        } else {
            return;
        }

    }

    //返回分段计时的节点时长
    public void getSplitTime() {
        System.out.println("分段时间节点时长：" + split_time);
    }

    //返回计时总时长
    public void getTime() {

        System.out.println("计时总时长：" + (stopTime - startTime + temp_time) / 1000);
    }

    /*public void show(){
        if(runningState!=2){
            System.out.println("-------------------------");
            System.out.println((System.currentTimeMillis())/1000.0);
            System.out.println("-------------------------");
        }
    }*/
    public static void main(String[] arge) throws InterruptedException {
        MyStopWatch time = new MyStopWatch();


        boolean flag = true;
        while (flag) {
            //time.show();
            //Calendar cal=Calendar.getInstance();
            //System.out.println(cal.get(Calendar.SECOND));
            System.out.println("0:退出计时-1:开始计时-2:退出计时-3:暂停-4:取消暂停-5:分段计时-6:取消分段-7:分段节点-8:总时长");
            Scanner cin = new Scanner(System.in);
            int count = cin.nextInt();
            switch (count) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    time.start();
                    break;
                case 2:
                    time.stop();
                    break;
                case 3:
                    time.suspend();
                    break;
                case 4:
                    time.resume();
                    break;
                case 5:
                    time.split();
                    break;
                case 6:
                    time.un_split();
                    break;
                case 7:
                    time.getSplitTime();
                    break;
                case 8:
                    time.getTime();
                    break;
            }
        }
         /*time.start();
            sleep(3000);//开始后让秒表跑三秒

            time.suspend();
            sleep(2000);//暂停两秒后再开始计时

            time.resume();
            sleep(4000);//再次开始4秒后开始分段计时

            time.split();
            sleep(2000);//第一次分段后2秒后再次分段

            time.split();

            time.getSplitTime();//显示分段节点时长

            time.un_split();//结束分段

            time.stop();//结束计时
            time.getTime();//显示最后的计时总时长
            */

    }
}

