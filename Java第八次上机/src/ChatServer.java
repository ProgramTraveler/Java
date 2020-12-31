
import java.io.*;
import java.net.*;
import java.util.*;
public class ChatServer {
    private  List<Client> clients = new ArrayList<Client>();// 用于添加用户
    private static int clientNumber=1;

    public static void main(String args[]) {
        ChatServer chatServer = new ChatServer();
        chatServer.init();
    }
    @SuppressWarnings("resource")
    public void init() {
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(8090);
            System.out.println("*************服务端***************");
            System.out.println("服务器已经开启，端口8090等待被连接");
        } catch (IOException e1) {
            System.out.println("该端口正在监听！");         // ServerSocket对象不能重复创建
            return;
        }

        while (true) {
            try {
                socket = server.accept();
                System.out.println(" 用户Client"+clientNumber+"连上");
            } catch (IOException e) {
                System.out.println("用户连接失败");
            }
            if (socket != null) {
                Client client = new Client(socket);
                clientNumber++;
                clients.add(client);
                client.start();
            }
        }
    }

    private class Client extends Thread {
        @SuppressWarnings("unused")
        Socket socket = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        String message = null;
        String name = null;

        Client(Socket socket) {
            name = "client"+clientNumber;
            this.socket = socket;
            try {
                out = new DataOutputStream(socket.getOutputStream());
                in = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                System.out.println("服务器已经断开！");
            }
        }

        public void run() {
            sendToEveryClient(this.name);
            for (int i = 0; i < clients.size(); i++) {         // 将信息发往每个用户我上线了
                Client client = clients.get(i);
                if(!client.equals(this))
                    client.sendToEveryClient(this.name+"上线了");

                if(client.equals(this)) {
                    for (int j = 0; j < clients.size()-1; j++) {            // 将信息发往刚上线的用户谁在线了(除了自己
                        Client clienta = clients.get(j);
                        client.sendToEveryClient(clienta.name+"在线上了！");
                    }
                }
            }
            try {
                while (true) {
                    message = in.readUTF();
                    for (int i = 0; i < clients.size(); i++) {              // 将信息发往每个用户（除了自己
                        Client client = clients.get(i);
                        if(!client.equals(this)) {
                            client.sendToEveryClient(this.name+"："+message);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println(this.name+"客户离开");
                for (int i = 0; i < clients.size(); i++) {             // 将信息发往每个用户我下线了
                    Client client = clients.get(i);
                    if(!client.equals(this))
                        client.sendToEveryClient(this.name+"离开了");
                }
            }
        }

        public void sendToEveryClient(String str) {    // 将信息发送到每一位用户
            try {
                out.writeUTF(str);
                out.flush();
            } catch (IOException e) {
                clients.remove(this);       //用户退出
            }
        }
    }
}

