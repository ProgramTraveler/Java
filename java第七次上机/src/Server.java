import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888); // 接口 暴露给客户端。
        Socket client = ss.accept();  // 一个accept 就是一个连接
        System.out.println("客户端 已经建立了连接");
        // 输入输出流 操作。
        DataInputStream dos = new DataInputStream(client.getInputStream());

        String msg = dos.readUTF();
        System.out.println(msg);

        client.getOutputStream();

        // 释放资源
        client.close();
    }
}
