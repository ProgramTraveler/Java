import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {



        Socket client = new Socket("localhost",8888); // 放入服务器的ip 和 端口
        System.out.println("--------Client----------");

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String data = "Hello world";
        dos.writeUTF(data);

        ObjectOutputStream ios = new ObjectOutputStream(client.getOutputStream());

        //ios.writeUTF();
        client.getInputStream();
        dos.flush();
        dos.close();
    }
}
