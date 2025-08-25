package assignment.iostreamTest_0825;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/byte_output.txt");

        while (true) {
            int data = is.read();
            if (data == -1) break;
            System.out.print((char) data + " ");
        }
    }
}