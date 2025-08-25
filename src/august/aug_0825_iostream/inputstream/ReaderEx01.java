package august.aug_0825_iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReaderEx01 {
    public static void main(String[] args) {
        try {
            // 1. 리소스 객체를 대상으로 입력스트림 생성
            InputStream is = new FileInputStream("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/test1.db");

            // 2. 리소스의 데이터가 존재한다면 읽어온다.
            while (true) {
                int data = is.read();
                // 파일은 더이상 읽을 수 없는 끝이 있다. EOF(end of file) => -1 return
                if (data == -1) break;
                else System.out.println(data);

            }

            // 3. 다 읽었으면 입력스트림 닫기.
            is.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}
