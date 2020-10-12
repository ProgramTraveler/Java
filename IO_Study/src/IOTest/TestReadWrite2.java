package IOTest;

import java.io.*;

public class TestReadWrite2 {
    public static void main(String[] arge) throws IOException {
        Reader reader=new FileReader("E:\\FilePractice\\abc\\1.txt");
        Writer writer=new FileWriter("E:\\FilePractice\\2.txt");

        char[] ch=new char[2048]; //数组大小为1024的整数倍

        reader.read(ch);
        writer.write(ch);

        reader.close();
        writer.close();

    }
}
