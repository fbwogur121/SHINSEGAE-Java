package assignment.morningTest;

public class MorningTest_class {
    public static void main(String[] args) {
        /*
        1번 - 3
        2번 - 4
        3번 - 4
        4번 - 3
        5번 - 1
        6번 - 4
        7번 - 2
        8번 - 2
        9번 - 4
        10번 - 4
        11번 - 3
        12번 - 필드 / 생성자 / 메소드
         */

        //13~15번
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

        // 16번
//        Printer printer = new Printer();
//        printer.println(10);
//        printer.println(true);
//        printer.println(4.5);
//        printer.println("홍길동");

        // 17번
        Printer.println(10);
        Printer.println(true);
        Printer.println(4.5);
        Printer.println("홍길동");

        // 18번
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        if(obj1 == obj2) System.out.println("같은 ShopService 객체입니다.");
        else System.out.println("다른 ShopService 객체입니다");

        // 19번
//        Account account = new Account();
//        account.setBalance(10000);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(-100);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(2000000);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(300000);
//        System.out.println("현재 잔고: " + account.getBalance());

    }

}
