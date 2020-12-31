/*
purpose:是用户的原始测试程序，每次要是有新用户的话就只需要修改一下类名就行
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatClient {
    DataInputStream in = null;
    DataOutputStream out = null;
    Socket mysocket = null;

    public static void main(String args[]) {
        ChatClient chatClient = new ChatClient();
        chatClient.init();
    }

    public void init() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        try {
            mysocket = new Socket("127.0.0.1", 8090);
            Thread thread = new Thread(new SentToServer());
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

