package board_Proj_v1;
/*
사용자가 현재 게시물목록을 있다.
사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽고, 삭제할 수 있다.
사용자는 게시판 프로그램을 종료할 수 있다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class BoardExample {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // static 처리를 해서 공용객체로 만든것.
    private static final String menuNumberRegex = "[1-4]"; // 1~4 사이의 숫자만 받겠다. 이외에는 허용하지 않겠다.
    private static final String checkNumberRegex = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    BoardManager boardManager;

    public BoardExample(){}
    public BoardExample(BoardManager boardManager){
        this.boardManager = boardManager;
    }

    //현재 게시판의 전체 게시물 목록을 출력하는 기능 list
    public void list(){
        System.out.println("[게시판 목록]");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-6s%-12s%-12s%-20s%n", "no", "writer", "date", "title");
        System.out.println("------------------------------------------------------");
        Map<String, Board> board = null;

        System.out.println();
        mainMenu();
    }

    public void mainMenu(){
        System.out.println("------------------------------------------------------");
        System.out.println("메인 메뉴: 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
        System.out.println("------------------------------------------------------");

    }

    // 게시물 메인 메뉴 선택 기능
    public void run() throws IOException {
        boolean t = true;
        while(t){
            list();

            System.out.print("메뉴 선택: ");
            String input = br.readLine();

            if(input.equals("4")){
                System.out.println("\n 게시판 종료");
                break;
            }
            if(input.matches(menuNumberRegex)){
                switch (input){
                    case "1":
                        System.out.println("create()메소드 실행\n");
                        break;
                    case "2":
                        System.out.println("read()메소드 실행\n");
                        break;
                    case "3":
                        System.out.println("clear()메소드 실행\n");
                        break;
                }
            } else {
                System.out.println("1~4번 번호를 입력하세요");
            }


        }
    }

}

