import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Screen {
    public static void main(String[] arge) throws IOException {
        Geo g = new Geo();

        MyThread ins = new MyThread(g);
        MyThread dis = new MyThread(g);
        Thread t1 = new Thread(ins,"Inserter");
        Thread t2 = new Thread(dis,"Disptcher");


        t1.start();
        t2.start();

        Socket client = new Socket("localhost",8888); // 放入服务器的ip 和 端口
        System.out.println("--------Client----------");

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String data = "Hello world";
        dos.writeUTF(data);

        ObjectOutputStream ios = new ObjectOutputStream(client.getOutputStream());
        System.out.println(dis.m);


        client.getInputStream();
        dos.flush();
        dos.close();

    }
}
