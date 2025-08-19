package august.aug_0813_generic.exceptionEx;

public class ExceptionEx01 {
    public static void main(String[] args) {
        // array에서 값을 추출해서 숫자로 바꾸어 출력하고
        // 해당 예외사항을 예측하여 예외처리 하시오.
        String[] array = {"100", "l00"};
            try {
                for (int i = 0; i < array.length; i++) {
                    int x = Integer.parseInt(array[i]);
                    System.out.println(x);
                }
            } catch (ArrayIndexOutOfBoundsException e1){
                e1.getMessage();
            } catch (NumberFormatException e2) {
                e2.getMessage();
            }
            System.out.println("프로그램 종료");
    }
}
