package july.Jul_0729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = br.readLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = br.readLine();

        String[][] nBook = new String[NUM_BOOK][NUM_ITEM];
//        만들게 될 메뉴별 메서드
//        →1. 고객 정보 확인하기: menuGuestInfo()
//        →2. 장바구니 상품 목록 보기: menuCartItemList()
//        →3. 장바구니 비우기: menuCartClear()
//        →4. 바구니에 항목 추가하기: menuCartAddItem()
//        →5. 장바구니의 항목 수량 줄이기: menuCartRemoveItemCount()
//        →6. 장바구니의 항목 삭제하기: menuCartRemoveItem()
//        →7. 영수증 표시하기: menuCartBill()
//        →8. 종료: menuExit()
        while (true) {
            menuIntroduction();

            int n = Integer.parseInt(br.readLine());
            if (n < 1 || n > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1:
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        menuCartAddItem(nBook);
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        menuExit();
                        return;
                }
            }

        }

    }

    public static void menuIntroduction() {
        System.out.println("***********************************************");
        System.out.println("        Welcome to Shopping Mall");
        System.out.println("        Welcome to Book Market!");
        System.out.println("***********************************************");
        System.out.println(" 1. 고객 정보 확인하기    \t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기       \t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기       \t8. 종료");
        System.out.println("***********************************************");
        System.out.print("메뉴 번호를 선택해주세요 ");
    }

    public static void menuGuestInfo(String name, String mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + " 연락처 " + mobile);
    }

    public static void menuExit(){
        System.out.println("8. 종료");
    }

    public static void BookList(String[][] book) {
        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";


        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터 입문";
        book[2][6] = "2019/06/10";
    }

    public static void menuCartAddItem(String[][] book){
        BookList(book);
        for(int i = 0; i<NUM_BOOK;i++){
            for(int j = 0 ; j < NUM_ITEM; j++){
                System.out.print(book[i][j]+"|");
            }
            System.out.println();
        }
    }
}
