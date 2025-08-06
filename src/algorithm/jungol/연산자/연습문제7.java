package algorithm.jungol.연산자;

import java.io.IOException;

public class 연습문제7 {
    public static void main(String[] args) throws IOException {
        int a = 0, b = 1, c = 2;
        System.out.print((a != 0 && b != 0 ? 1 : 0) + " ");
        System.out.print((a != 0 || b != 0 ? 1 : 0) + " ");
        System.out.print((c != 0 && b != 0 ? 1 : 0) + " ");
        System.out.print((a != 0) ? 0 : 1);
    }
}
