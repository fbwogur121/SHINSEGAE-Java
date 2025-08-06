package august.aug_0801.methods;

public class StringEx01 {
    public static void main(String[] args) {

        // 1. 문자열에서 원하는 문자 추춸하기
        String subject = "자바객체프로그래밍";
        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "0008123123123";
        char gender = ssn.charAt(6);
        switch (gender){
            case '1':
            case '3':
                System.out.println("남성");
                break;

            case '2':
            case '4':
                System.out.println("여성");
                break;
        }

        // 2. 문자열 길이 : lenght()
        int len = ssn.length();
        System.out.println(len);

        // 3. 문자열 대체 기능 : replace("원본 문자열", "바꿀 문자열")
        String oldStr = "신세계 자바 과정";
        String newStr = oldStr.replace("자바", "자바 백엔드");
        System.out.println(newStr);


        // 4. 문자열 잘래내기 : substring(int, beginIndex), substring(int beginIndex, int endIndex)
        String ssn1 = "880815-1234567";
        String ssn2 = ssn1.substring(0, 6);
        String ssn3 = ssn1.substring(7);
        System.out.println(ssn2);
        System.out.println(ssn3);

        // 5. 문자열에서 문자 찾기 : 문자열에서 특정 문자의 위치를 찾을 때 indexOf()
        int index = subject.indexOf("프로그래밍");
        System.out.println(index);
        if(index == -1) System.out.println("포함되어 있지 않다");
        else System.out.println("포함되어 있다");

        // 6. 문자열이 포함여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        // 7. 문자열 분리 : split() 여러 개의 문자열로 구성 시, 이를 따로 구분자를 기준으로 분리해서 문자열을 처리하고 싶다.
        String board = "번호,제목,내용,설명";
        String[] boardStr = board.split(",");
        for(int i=0; i<boardStr.length; i++){
            System.out.print(boardStr[i]+" ");
        }
        System.out.println();
        for(String string: boardStr){
            System.out.print(string+" ");
        }

    }
}
