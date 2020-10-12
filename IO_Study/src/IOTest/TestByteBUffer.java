package IOTest;

import java.io.*;

public class TestByteBUffer {
    public static void main(String[] arge) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\FilePractice\\4.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\FilePractice\\5.jpg"));

        int len;
        while((len=bis.read())!=-1){
            bos.write(len);
        }

        bis.close();
        bos.close();
    }
}
