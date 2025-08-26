package assignment.iostreamTest_0825;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고
// 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("data.dat");
        dos = new DataOutputStream(fos);

        dos.writeInt(100);
        dos.writeUTF("Java");
        dos.writeBoolean(true);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("data.dat");
        dis = new DataInputStream(fis);

        int num = dis.readInt();
        String str = dis.readUTF();
        boolean bln = dis.readBoolean();

        System.out.println(num + " " + str + " " + bln);

        dis.close();
        fis.close();
    }
}