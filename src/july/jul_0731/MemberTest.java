package july.jul_0731;

public class MemberTest {
    public static void main(String[] args) {
        Member firstMember = new Member();
        firstMember.name = "홍길동";
        firstMember.age = 20;
        firstMember.phoneNum = "010-2323-3434";
        firstMember.email = "abcd@naver.com";
        firstMember.home = "서울";
        firstMember.weight = 52.33;

        Member secondMember = new Member();
        secondMember.name = "강길동";
        secondMember.age = 25;
        secondMember.phoneNum = "010-5656-3434";
        secondMember.email = "efg@naver.com";
        secondMember.home = "서울";
        secondMember.weight = 42.33;

        //삼성지점 헬스센터
        Member[] Samsung = new Member[2];
        Samsung[0] = firstMember;
        Samsung[1] = secondMember;

        //삼성 지점 회원정보 출력
        for(int i = 0; i<Samsung.length; i++){
            Member member = Samsung[i];
            System.out.println(member.name);
        }
        // 위와 동일한 for문
        for(Member member : Samsung){
            System.out.println(member.name);
        }

    }
}
