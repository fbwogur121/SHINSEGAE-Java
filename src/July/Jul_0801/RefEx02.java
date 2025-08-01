package July.Jul_0801;

/*
* 똑같은 변수 a의 주소값을 출력하였다.
* 문자열이 변경됨에 따라 주소값이 바뀌어 있음을 확인
* 즉, 문자열 값 자체는 불변이라 변경할 수 없지만, 새로운 공간을 할당받아 바뀐 문자열을 저장한다.
* */

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello, ";
        System.out.println(a.hashCode());

        a += "Java Programming";
        System.out.println(a.hashCode());

        System.out.println(a);
    }
}
