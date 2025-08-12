package august.aug_0812_exception;

//컴파일 예외 클래스 종류와 처리

// 1. IOException : 입출력(input/output)을 다루는 메소드는 반드시 IOException을 처리하도록 규정되어 있다.
// 2. FileNotFoundException : 파일에 접근하려고 하는데 지정 위치에 해당 파일이 없을 경우 발생.

import java.io.*;

public class Exception01 {
    public static void main(String[] args) throws IOException {
        byte[] list = {'a', 'b', 'c'};
        System.out.write(list);

        // BufferedReader br = new BufferedReader(new FileReader("test.txt")); -> FileNotFoundException 발생
        try{
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }
}

// 예외처리 방법
// 1. try-catch
// 2. throws 던져서 처리