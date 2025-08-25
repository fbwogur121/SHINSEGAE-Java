package assignment.iostreamTest;

import java.io.File;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) {
        String copyFile = "/Users/fbwogur121/Desktop/신세계 I&C/IOStreamEx/temp/copy.jpg";

        File file = new File(copyFile);

        long fileSize = file.length();
        System.out.println(fileSize);
    }
}