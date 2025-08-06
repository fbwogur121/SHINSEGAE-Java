package algorithm.jungol.입력;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        double a = sc.nextDouble();
        double yard = 91.44;
        System.out.printf("%.1fyard = %.1fcm",a,a*yard);
    }
}
