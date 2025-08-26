package assignment.iostreamTest_0825;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws IOException {
        // numbers.dat 파일에 정수데이터를 써야 하므로 FileOutputStream fos 객체 생성
        FileOutputStream fos = new FileOutputStream("numbers.dat");
        // 성능을 높이기 위한 보조스트림 DataOutputStream dos 생성
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("numbers.dat");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++) {
            int num = dis.readInt();
            System.out.println(num + " ");
        }
        dis.close();
        fis.close();

    }
}