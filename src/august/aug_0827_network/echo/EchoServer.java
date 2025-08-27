package august.aug_0827_network.echo;


import august.aug_0806_inheritance.abcdefExample.D;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) throws IOException {
        // 안내 문구
        info();

        // 서버 시작
        startServer();

        // 키보드 입력 받기 - q 입력시 서버 종료
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String key = br.readLine();
            if(key.toLowerCase().equals("q")) break;
        }
        br.close();

        // TCP 서버 종료
        stopServer();

    }

    public static void info(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("--------------------------------------------------------------------");
    }

    public static void startServer(){
        Thread thread = new Thread() {
            @Override
            public void run(){
                try{
                    // ServerSocket 생성, 포트 바인딩
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[Server] 시작");

                    // 연결 수락 및 데이터 통신
                    while(true){
                        System.out.println("[Server] 요청 기다림,,");

                        // 연결 수락
                        Socket socket = serverSocket.accept();
                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[Server]" + isa.getHostName() + "연결 요청 수락");

                        // 데이터 받기
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String message = dis.readUTF();

                        // 데이터 보내기
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(message);
                        dos.flush();
                        System.out.println("[Server] 받은 데이터를 다시 보냄" + message);

                        // 연결 끊기
                        socket.close();
                        System.out.println("[Server]" + isa.getHostName()+"와의 연결을 끊음.");
                    }
                } catch (IOException e){
                    System.out.println("[Server]" + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer(){
        try{
            serverSocket.close();
            System.out.println("[Server] 종료");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}