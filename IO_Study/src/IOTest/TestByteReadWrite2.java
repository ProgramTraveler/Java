package IOTest;

import java.io.*;

public class TestByteReadWrite2 {
    public static void main(String[] arge) throws IOException {
        //按字符数组读取
        InputStream is=new FileInputStream("E:\\FilePractice\\3.jpg");
        OutputStream os=new FileOutputStream("E:\\FilePractice\\4.jpg");

        byte[] b=new byte[2048];
        int len;
        while((len=is.read(b))!=-1){
            os.write(len);
        }

        is.close();
        os.close();
    }
}
