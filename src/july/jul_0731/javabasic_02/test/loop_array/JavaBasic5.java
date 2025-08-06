package july.jul_0731.javabasic_02.test.loop_array;

public class JavaBasic5 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
