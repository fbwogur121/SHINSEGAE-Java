package august.aug_0825_iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReaderEx02 {
    public static void main(String[] args) {
        try {
            // 1. 리소스 객체를 대상으로 입력스트림 생성
            InputStream is = new FileInputStream("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/test2.db");
            byte[] array = new byte[is.available()];

            // 2. 리소스의 데이터가 존재한다면 읽어온다.
            while (true) {
                int data = is.read(array); // is.available()만큼 데이터를 읽고 읽은 바이트는 array에 저장, 읽은 바이트 수 만큼 정수값 리턴
                // 파일은 더이상 읽을 수 없는 끝이 있다. EOF(end of file) => -1 return
                if (data == -1) break;

                for (int i = 0; i < data; i++) {
                    System.out.println(array[i]);
                }
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
