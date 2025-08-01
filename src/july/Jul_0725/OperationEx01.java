package july.Jul_0725;

public class OperationEx01 {
    public static void main(String[] args) {
        //부호 연산 : 변수의 부호를 유지하거나 변경한다.
        byte b = 100;

        //증감연산자
        int x1 = 10;
        int y1 = 10;
        int z;
        System.out.println("x1 : " + x1);
        x1++;
        System.out.println("x1 : " + x1);
        ++x1;
        System.out.println("x1 : " + x1);

        //promotion
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result4 = v1+v2; //모든 피연산자는 int 타입으로 자동변환 후 연산
        System.out.println(result4);

        long result5 = v1+v2-v4; //모든 피연산자는 가장 큰 타입인 long으로 promotion된 후 연산됨
        System.out.println(result5);

        double result6 = (double)v1/v2;
        System.out.println(result6);

        int result7 = v1%v2;
        System.out.println(result7);

    }
}
