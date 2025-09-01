package august.aug_0828_multithread.socketpractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class PracticeCllient {

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 5001);
            System.out.println("클라이언트 연결");

            String message = "서버에게 보내는 메세지";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(message);
            dos.flush();
            System.out.println("서버에게 보낸 메세지 : " + message);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("서버로부터 받은 메세지 : "+receiveMessage);

            socket.close();
            System.out.println("클라이언트 종료");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
