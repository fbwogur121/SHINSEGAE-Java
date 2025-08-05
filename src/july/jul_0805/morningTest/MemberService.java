package july.jul_0805.morningTest;

public class MemberService {
    public boolean login(String id, String password) {
        return "hong".equals(id) && "12345".equals(password);
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}