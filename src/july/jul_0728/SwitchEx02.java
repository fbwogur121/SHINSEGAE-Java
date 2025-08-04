package july.jul_0728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char grade = br.readLine().charAt(0);
        System.out.println(grade);

        //사용자에게 A~C 중 한 문자를 받아 매우우수, 우수, 노력하세요 출력
        switch(grade){
            case 'A':
                System.out.println("매우우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력 필요");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
