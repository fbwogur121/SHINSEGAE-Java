package august.aug_0827_network.socket01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

// Socket 프로그램 로직.txt에 설명되어 있음.
public class ServerSocketEx01 {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException{
        System.out.println("-----------Starting Server Socket-----------");
        System.out.println("서버를 종료하려면 Q 또는 q를 입력하rh Enter를 누르세요.");
        System.out.println("--------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키보드 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String key = br.readLine();
            if(key.toLowerCase().equals("q")) break;
        }

        // TCP 서버 종료
        stopServer();

    }

    public static void startServer(){
        // 스레드 Thread : 실행단위
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    serverSocket = new ServerSocket(50002);
                    System.out.println("[Server] 시작");

                    // while 무한반복 -> 클라이언트 요청이 올때까지 무한 감시
                    while(true){
                        System.out.println("\n[Server] 연결 요청을 기다립니다. \n");

                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 정보 얻기
                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[Server] " + ia.getAddress() + " : " + ia.getPort() + " 의 연결을 수락합니다.");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[Server] 연결 종료");

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }

    public static void stopServer(){
        try{
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
