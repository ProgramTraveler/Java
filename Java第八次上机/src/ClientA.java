import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ClientA {
    DataInputStream in = null;
    DataOutputStream out = null;
    Socket mysocket = null;

    public static void main(String args[]) {
        ClientA chatClient = new ClientA();
        chatClient.init();
    }

    public void init() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        try {
            mysocket = new Socket("127.0.0.1", 8090);
            Thread thread = new Thread(new ClientA.SentToServer());
            System.out.print("客户端");
            in = new DataInputStream(mysocket.getInputStream());
            out = new DataOutputStream(mysocket.getOutputStream());

            thread.start();
            String message=null;
            while (true) {
                try {
                    message= scanner.next();
                    out.writeUTF(message);
                    out.flush();
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {
            System.out.println("服务器开没开启！" );
        }
    }
    private class SentToServer implements Runnable {
        public void run() {
            try {
                while (true) {
                    String str = in.readUTF();
                    System.out.println(str);
                }
            } catch (SocketException e) {
                System.out.println("服务器已关闭！");    //告诉用户服务器断开
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
