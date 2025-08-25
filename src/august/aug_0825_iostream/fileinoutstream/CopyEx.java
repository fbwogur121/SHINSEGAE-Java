package august.aug_0825_iostream.fileinoutstream;

import java.io.*;

//파일 복사 기능 : FileInputStream 읽은 바이트를 바로 FileOutputStream으로 출력기능.
public class CopyEx {

    public static void main(String[] args) throws IOException {
        String originalFileName = "/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/test.jpg";
        String newFileName = "/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/testCopy1.jpg";

        // 1. InputStream, OutputStream 객체 생성 => 파일을 대상으로 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

        /*
        // 2. 이미지 객체의 데이터를 byte 형태로 읽어온다.
        byte[] buffer = new byte[is.available()]; // 읽은 바이트 수만큼 저장할 저장소 생성
        while (true) {
            int numRead = is.read(buffer);
            if (is.read(buffer) == -1) break;

            os.write(buffer, 0, numRead);
        }
        */

        // java9 부터 입력스트림에서 출력스트림으로 바이트를 복사하는 메소드를 제공 : transferTo()
        // 위의 2번처럼 안해도 딤.
        is.transferTo(os);

        // 내부 비우기
        os.flush();
        // 스트림 닫기
        os.close();
        is.close();

        System.out.println(newFileName + "복사 완료");
    }
}
