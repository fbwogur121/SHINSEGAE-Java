package august.aug_0804;

import java.util.Scanner;

public class Example01 {
    public static Scanner in = new Scanner(System.in);

    public static void method(){
        int counter = in.nextInt();
        System.out.println(counter);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            method();
        }
    }
}
