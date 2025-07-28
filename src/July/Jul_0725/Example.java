package July.Jul_0725;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws Exception{
        int price = 5000;
        System.out.printf("상품의 가격: %d원\n", price);
        System.out.printf("상품의 가격: %7d원\n", price);
        System.out.printf("상품의 가격: %07d원\n", price);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("반지름을 입력하세요.");
        int r = Integer.parseInt(br.readLine());
        System.out.printf("반지름이 %d인 원의 넓이: %.2f",r, Math.PI*r*r);
    }
}
