package teamMission.teamMission_v1_0826;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentInput extends Student{
    static String fileName = "student.dat";

    public static void main(String[] args) {


        try{
            while(true){
                printUsage();



            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    //기존 student.dat 유무 확인 및 로드(없으면 신규 생성)
    public static void loadCheck(){

    }

    //사용법/입력 안내 출력
    public static void printUsage(){
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
        System.out.println("- 정수는 0~100 사이의 정수만 가능합니다.");
    }

    //중복 이름 검사, 점수 유효성(0~100) 검사, total/average/grade 산출 후 맵에 담기
    public static void checkKeyAndInputData(){

    }

    //ObjectOutputStream으로 studentInfo 직렬화 저장
    public static void saveData() throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        loadCheck();
        //oos.writeObject();
    }
}
