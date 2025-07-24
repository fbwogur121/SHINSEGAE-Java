package Algorithm.Jungol;

import java.util.Scanner;

public class jun_9031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max, min;

        if(a>b){
            max = a;
            min = b;
        } else{
            max = b;
            min = a;
        }


        System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", max, min);

    }
}
