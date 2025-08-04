package july.jul_0724;

public class BooleanEx {
    public static void main(String[] args) {
        int x = 30;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x < 0 || x >= 30);
        System.out.printf("%b %b %b %b ", result1, result2, result3, result4);
    }
}
