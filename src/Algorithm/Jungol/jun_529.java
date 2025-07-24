package Algorithm.Jungol;

import java.util.Scanner;

public class jun_529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int kk = b+100-a;
        System.out.println(kk);
        if(kk>0){
            System.out.println("Obesity");
        }

    }
}
