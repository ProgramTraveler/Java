package IOTest;

import java.io.*;

public class TestBuffer2 {
    public static void main(String[] arge) throws IOException {
        //通过字符缓冲流“一次读写一行”
        //创建字符缓冲输入流对象，关联源数据文件
        BufferedReader br=new BufferedReader(new FileReader("E:\\FilePractice\\abc\\1.txt"));
        //创建字符输出流对象，关联目的文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\FilePractice\\2.txt"));
        //定义变量，记录读取的内容
        String data;
        //循环读取
        while((data=br.readLine())!=null){
            bw.write(data);
            //注意换行操作
            bw.newLine();
        }
        //释放资源
        br.close();
        bw.close();
    }
}
