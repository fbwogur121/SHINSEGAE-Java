package assignment.iostreamTest_0825;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/hello.txt");
        char[] datas = new char[100];

        while(true){
            int numRead = reader.read(datas);
            if(numRead == -1) break;
            for (int i = 0; i < numRead; i++) {
                System.out.print(datas[i]);
            }
        }
        reader.close();
    }
}