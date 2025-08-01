package july.Jul_0801.stringBufferEx;

public class StringEx01 {
    public static void main(String[] args) {
        // 1. 기존 String
        // + 연산자를 이용하여 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스 생성.
        // 문자열을 많이 결합할 수록 메모리 낭비, 속도 저하 등 단점이 있다.
        String result = "";
        result += "Hello";
        result += " ";
        result += "Java Programming";
        System.out.println(result);

        // 2. StringBuffer > 멀티 스레드 환경에서 스레드 safety하다.
        // StringBuffer 클래스는 클래스 내부에 버퍼(buffer - 16개의 문자를 저장, 생성자를 통해 크기를 조절할 수 있음.)라는 독립적인 공간을 가지고 있어
        // 문자열을 바로바로 추가할 수 있어 공간의 낭비 없이 문자열 연산 속도를 빠르게 처리할 수 있다.
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        sb1.append(" Java");
        sb1.append(" Programming");
        String result1 = sb1.toString(); // StringBuffer는 반드시 String 타입으로 마무리 변환 해 주어야 한다.
        System.out.println(result1);

        // 3. StringBuilder >

    }
}
