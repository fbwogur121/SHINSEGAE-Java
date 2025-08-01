package july.Jul_0801.stringBufferEx;

// StringBuffer 주요 메서드
public class StringBufferEx {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(str.hashCode());
        System.out.println();

        // StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 : " + sb.toString());
        System.out.println(str.hashCode());
        System.out.println();

        // str 문자열에서 "cde" 문자 추출
        System.out.println("문자열 추출 : " + sb.substring(2, 5));
        System.out.println(str.hashCode());
        System.out.println();

        // str 문자열에 "2" 를 추가
        System.out.println("문자열 삽입(추가) : " + sb.insert(2, "추가"));
        System.out.println(str.hashCode());
        System.out.println();

        // 문자열 삭제
        System.out.println("문자열 삭제 : " + sb.delete(2, 7));
        System.out.println(str.hashCode());
        System.out.println();

        //문자열 붙이기
        System.out.println("문자열 붙이기 : " + sb.append("ㅋㅋㅋㅋㅋ"));
        System.out.println(str.hashCode());
        System.out.println();

        // 문자열의 길이
        System.out.println("문자열 길이 : " + sb.length());
        System.out.println();

        // buffer 용량 조정
        System.out.println("용량 : " + sb.capacity());
        System.out.println();

        // 문자열 역순
        System.out.println("역순 : " + sb.reverse());
        System.out.println();

        // 현상태 확인
        System.out.println("마지막 상태 체크 : " + sb);
        System.out.println(str.hashCode());
        System.out.println();

        // 마지막 단계 String 형으로 변환
        str = sb.toString();
        System.out.println(str.hashCode());

    }
}
