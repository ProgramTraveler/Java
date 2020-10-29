package ThirdQuestion;

import java.io.IOException;
import java.nio.CharBuffer;

public class TestRead implements Readable{
    private int ReadNum=0; //记录读的次数
    private int LoopNum=0; //记录循环的次数

    @Override
    public int read(CharBuffer cb) throws IOException {
        //仅在第一次时添加四个数据
        if(LoopNum==0 || LoopNum==5){
            cb.append("aa bb cc dd "); //以空格符为分割符
            ReadNum++;
            LoopNum++;
            System.out.println("进入read第"+ReadNum+"次读");

            return 1;
        }
        //其他时候返回1，仅是调用查看
        else if(LoopNum<10){

            ReadNum++;
            LoopNum++;
            System.out.println("进入read第"+ReadNum+"次读");
            return 1;
        }else return -1;

    }
}
