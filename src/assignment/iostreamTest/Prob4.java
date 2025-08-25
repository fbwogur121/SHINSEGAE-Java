package assignment.iostreamTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/byte_output.txt");

        byte A = 65;
        byte B = 66;
        byte C = 67;
        byte D = 68;
        byte E = 69;

        os.write(A);
        os.write(B);
        os.write(C);
        os.write(D);
        os.write(E);

        System.out.println("저장완료");

        os.flush();
        os.close();
    }
}