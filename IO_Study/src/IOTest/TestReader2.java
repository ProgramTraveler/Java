package IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReader2 {
    public static void main(String[] arge) throws IOException {
        //需求：通过字符流读取数据，一次读取一个字符组
        //1.创建字符输入流对象
        Reader reader=new FileReader("E:\\FilePractice\\abc\\1.txt");
        //2.读取数据
        /*char[] chs=new char[3];
        int len1=reader.read(chs);
        System.out.println(chs);
        System.out.println(len1);

        int len2=reader.read(chs);
        System.out.println(chs);
        System.out.println(len2);

        int len3=reader.read(chs);
        System.out.println(chs);
        System.out.println(len3);

        int len4=reader.read(chs);
        System.out.println(chs);
        System.out.println(len4);*/

        //优化
        //定义字符数组
        char[] ch=new char[3];
        //定义一个变量。记录读取到的有效字符数
        int len;
        while((len=reader.read(ch))!=-1){
            //将读取到的类容转换成字符串，打印
            /*
                ch:表示要操作的数组
                0:表示起始索引
                len:表示要操作的字符的个数
             */
            String s=new String(ch,0,len);
            System.out.println(s);
        }
        //3.释放资源
        reader.close();
    }
}
