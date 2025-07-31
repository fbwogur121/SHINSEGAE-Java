package javabasic_02.test.loop_array;

public class JavaBasic7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int space, at;
            if (i <= 3) {
                space = 3 - i;
                at = 2 * i - 1;
            } else {
                space = i - 3;
                at = 2 * (6 - i) - 1;
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int a = 0; a < at; a++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
