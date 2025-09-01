package august.aug_0828_multithread.socketpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class PracticeServer {
    private static final int PORT = 5001;
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {

        startServer();

        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            if(br.readLine().toLowerCase().equals("q")) break;
        }

        stopServer();

    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(PORT);
                    while(true){
                        Socket socket = serverSocket.accept();
                        System.out.println("서버와 연결되었습니다.");

                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("주소: " + ia.getAddress() + "포트번호: " + ia.getPort());

                        socket.close();
                        System.out.println("서버 종료");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        thread.start();

    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("서버 종료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
