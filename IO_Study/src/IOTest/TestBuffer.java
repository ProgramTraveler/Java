package IOTest;

import java.io.*;

public class TestBuffer {
    public static void main(String[] arge) throws IOException {
        //创建字符缓冲输入流对象，关联数据源文件
        BufferedReader br=new BufferedReader(new FileReader("E:\\FilePractice\\abc\\1.txt"));
        //创建字符输出流对象，关联数据目的文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\FilePractice\\2.txt"));
        //定义变量，记录读取的数据
        int data;
        //循环读取，只要条件满足就一直读，并把读到的传给变量
        while ((data=br.read())!=-1){
            bw.write(data);
        }
        //释放资源
        br.close();
        bw.close();
    }
}
