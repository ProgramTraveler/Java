package IOTest;

import java.io.*;

public class TestByteReadWrite {
    public static void main(String[] arge) throws IOException {
        //按单个字节读取
        InputStream is=new FileInputStream("E:\\FilePractice\\3.jpg");
        OutputStream os=new FileOutputStream("E:\\FilePractice\\4.jpg");

        int data;
        while((data=is.read())!=-1){
            os.write(data);
        }

        is.close();
        os.close();
    }
}
