package august.aug_0825_iostream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) throws IOException {
        Reader reader = null;

        // 1. 문자 하나씩 읽기
        reader = new FileReader("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/testChar.txt");
        while (true){
            int data = reader.read();
            if(data == -1) break;
            System.out.print((char)data);
        }
        reader.close();
        System.out.println("\n");

        // 2. 문자 배열로 읽기
        reader = new FileReader("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/testChar.txt");
        char[] datas = new char[100];
        while(true){
            int numRead = reader.read(datas);
            if (numRead == -1 ) break;
            for (int i = 0; i < numRead; i++) {
                System.out.print(datas[i]);
            }
        }
        reader.close();


        // 3. 문자열 읽기
        reader = new FileReader("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/testChar.txt");

        char[] buffer = new char[100]; // 100 글자를 담을 수 있는 임시 버퍼
        StringBuilder stringBuilder = new StringBuilder(); // 효율적으로 문자열을 만들 객체

        while(true) {
            int numRead = reader.read(buffer); // 버퍼에 문자를 읽어 들이고, 읽은 글자 수를 반환
            if (numRead == -1) break; // 더 이상 읽을 내용이 없으면 종료
            stringBuilder.append(buffer, 0, numRead); // 읽은 만큼만 stringBuilder에 추가
        }

        System.out.println(stringBuilder.toString()); // 완성된 문자열 출력
        reader.close();



        reader.close();
    }
}
