package IOTest;

import java.io.*;

public class TestReadWrite {
    public static void main(String[] arge) throws IOException {
        //复制文件内容
        //按按单个字符读写
        Reader reader=new FileReader("E:\\FilePractice\\abc\\1.txt");
        Writer writer=new FileWriter("E:\\FilePractice\\2.txt");
        //Writer writer1=new FileWriter("E:\\FilePractice\\3.txt"); //如果目的地文件不存在，程序会自动创建

        int data;
        while ((data=reader.read())!=-1){
            writer.write(data);
        }

        reader.close();
        writer.close();



    }
}
