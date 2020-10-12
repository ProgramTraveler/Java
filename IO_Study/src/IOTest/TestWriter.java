package IOTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {
    public static void main(String[] arge) throws IOException {
        //通过字符流写数据


        Writer writer=new FileWriter("E:\\FilePractice\\2.txt");
        //一次写一个字符
        /*int x='王';
        writer.write(x);*/

        //一次写一个指定的字符数组
        /*char[] x={'红','澄','黄'};
        writer.write(x);
        writer.write(x,0,2); //表示从0索引开始的两个字符*/

        //一次写一个字符串
        writer.write("我爱学习");

        //释放资源
        writer.close();


    }
}
