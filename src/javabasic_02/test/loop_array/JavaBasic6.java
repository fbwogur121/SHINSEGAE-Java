package javabasic_02.test.loop_array;

public class JavaBasic6 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
