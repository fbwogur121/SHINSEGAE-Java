package august.aug_0827_network.socket01;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx01 {

    public static void main(String[] args) {
        // Socket 생성과 동시에 localhost 또는 IP의 Port의 연결 요청
        try{
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[Client] Connect to server 성공");

            socket.close();
            System.out.println("[Client] 클라이언트 연결 종료.");

        } catch (IOException e){
            System.out.println("[Client] 연결 실패");
        }
    }

}
