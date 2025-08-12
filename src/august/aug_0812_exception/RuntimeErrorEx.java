package august.aug_0812_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class RuntimeErrorEx {
    public static void main(String[] args) throws IOException {
        try {

            // ArrayIndexOutOfBoundsException : index 값이 범위를 넘어갈 경우 발생
            int array[] = {10, 20, 30};  // index: 0, 1, 2
            //System.out.println(array[3]);
            System.out.println(array[2]);

            // ArithmeticException : 어떤 수를 0으로 나누는 것과 같이 비정상 계산 중 발생
            //System.out.println(array[1]/0);

            // NullPointerException : null 객체 참조 시 발생
            String str = null;
            System.out.println(str);
            ///System.out.println(str.length());

            // NumberFormatException : 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
            String stringNumber = "3.1415928268";
            //int number = Integer.parseInt(stringNumber);
            double number = Double.parseDouble(stringNumber);
            System.out.println(number);

            // ClassCastException : 타입변환은 상위클래스와 하위클래스간의 상속, 인터페이스 캐스팅
            Integer num = 30;
            Object x = num;
            //System.out.println((String) x);

            // InputMismatchException : 의도치 않은 입력 오류 발생할 떄 예외
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (InputMismatchException e1){
            e1.getMessage();
        } catch (ArrayIndexOutOfBoundsException e2){
            e2.getMessage();
        } catch (ClassCastException e3){
            e3.getMessage();
        } catch (Exception e4) {
            e4.getMessage();
        } catch (Throwable t){
            t.getMessage();
        }
    }
}
// 예외처리는 subclass -> superclass로 확장하며 처리하는 것이 원칙.