package august.aug_0825_iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writer 클래스는 OutputStream과 사용법은 동일하지만, 출력 단위가 byte가 아닌 문자(char)이다.
// 문자열을 출력하는 writer(String str) 메소드가 추가 제공된다.
// Writer 클래스를 이용해서 하나의 문자, 문자 배열, 문자열 출력하는 기능 구현
public class WriterEx {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/testChar.txt");

        // 1. 문자 하나씩 출력
        char ch1 = 'a';
        writer.write(ch1);
        char ch2 = 'b';
        writer.write(ch2);

        // 2. 문자 배열 파일 출력
        char[] chars = {'\n', 'c', 'd', 'e', '\n'};
        writer.write(chars);

        // 3. 문자열 파일 출력
        String str = "Hello, IOStrea world!!";
        writer.write(str);

        writer.flush();
        writer.close();

    }
}
