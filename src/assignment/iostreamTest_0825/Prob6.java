package assignment.iostreamTest_0825;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws IOException {
        String originalFileName = "/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/image.jpg";
        String newFileName = "/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/copy.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

        is.transferTo(os);

        os.flush();
        is.close();
        os.close();
    }
}