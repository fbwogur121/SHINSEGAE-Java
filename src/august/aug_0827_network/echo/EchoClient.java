package august.aug_0827_network.echo;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try{
            // 소켓 생성과 동시에 localhost의 50001 포트로 연결 요청
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[Client] 연결 성공");

            // 데이터 보내기
            String message = "client에서 보내는 메세지";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(message);
            dos.flush();
            System.out.println("[Client] 데이터 전송 : " + message);

            // 데이터 받기
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[Client] 데이터 받음 : " + receiveMessage);

            // 연결 끊기
            socket.close();
            System.out.println("[Client] 연결 종료");

        } catch(Exception e){
            e.getMessage();
        }

    }
}