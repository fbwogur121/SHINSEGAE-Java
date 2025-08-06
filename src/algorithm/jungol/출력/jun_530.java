package algorithm.jungol.출력;

import java.util.Scanner;

public class jun_530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 20){
            System.out.println("adult");
        }else{
            System.out.printf("%d years later", 20-a);
        }
    }
}
