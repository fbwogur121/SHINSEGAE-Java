package august.aug_0819_lamda.anonymousClass_익명객체.class04;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        // Calculator 클래스를 생성하여 계산 할 수 있도록 클래스 필드에 값을 할당.
        Calculator calculator = new Calculator(number1, number2);

        int addResult = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

        System.out.println(addResult);

        int minusResult = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        });

        System.out.println(minusResult);
    }
}
