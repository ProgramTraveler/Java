package IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader {
    public static void main(String[] arge) throws IOException {
        //通过字符流读取数据
        //1.创建字符输入流对象
        Reader reader=new FileReader("E:\\FilePractice\\abc\\1.txt");
        //2.读取文件
        /*int ch1=reader.read();
        System.out.println(ch1);

        int ch2=reader.read();
        System.out.println(ch2);

        int ch3=reader.read();
        System.out.println(ch3);
        //文件读完，返回-1
        int ch4=reader.read();
        System.out.println(ch4);*/

        //优化上述的读法，用循环改,又因为不知道循环次数，所以使用while
        int ch;
        while ((ch=reader.read())!=-1){
            //ch=reader.read();
            System.out.println(ch);

        }

        //3.关闭资源
        reader.close();
    }
}
