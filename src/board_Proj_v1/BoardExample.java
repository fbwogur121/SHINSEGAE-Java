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
import java.util.*;
import java.util.logging.SimpleFormatter;

public class BoardExample {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // static 처리를 해서 공용객체로 만든것.
    private static final String menuNumberRegex = "[1-4]"; // 1~4 사이의 숫자만 받겠다. 이외에는 허용하지 않겠다.
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1; // static 공용변수. -> 누적되는값으로 사용하는 공간.

    // date 타입을 어떻게 사용할지 지정해준다.
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    BoardManager boardManager;

    // Board 매니저가 게시판을 관리한다.
    public BoardExample(){}
    public BoardExample(BoardManager boardManager){
        this.boardManager = boardManager;
    }

    //현재 게시판의 전체 게시물 목록을 출력하는 기능 list
    public void list(){
        Map<String, Board> boardMap = boardManager.getBoardMap(); // 게시판은 매니저가 담당하고 있으므로, 목록을 출력하고 싶으면 BoardManager에서 받아온다.

        System.out.println("[게시판 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s \n", "no", "writer", "date", "title");
        System.out.println("-".repeat(60));
        // Manager에게 전체 게시글 목록을 요청
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet()); // 보여주기만 하는거니까 list로 작성
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4s %-20s %-20s %-20s \n", value.getBno(), value.getBWriter(), dateFormat.format(value.getBDate()), value.getBTitle());
        });

        System.out.println();
        mainMenu();
    }

    public void mainMenu(){
        System.out.println("-".repeat(60));
        System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.println("-".repeat(60));

    }

    // 게시물 메인 메뉴 선택 기능
    public void run() throws IOException {
        boolean t = true;
        while(t) {
            list();

            System.out.print("메뉴 선택: ");
            String input = br.readLine();

            if (input.equals("4")) {
                System.out.println("\n 게시판 종료");
                break;
            }
            if (input.matches(menuNumberRegex)) {
                switch (input) {
                    case "1":
                        create();
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

    // 0. checkMenu : 보조 메뉴 확인, 선택 메서드
    public boolean checkMenu() throws IOException{
        System.out.println("-".repeat(60));
        System.out.println("보조 메뉴: 1.OK | 2.Cancel");
        System.out.print("메뉴 선택: ");
        while(true){
            String input = br.readLine();
            if(input.matches(checkNumber)){
                return input.equals("1"); // "1" 인 경우에만 리턴.
            } else {
                System.out.println("[1 or 2] 번을 입력해 주세요");
            }
        }
    }


    // 1. Create : 새 글 작성, Map에 저장 기능
    public void create() throws IOException{
        System.out.println("\n[새 게시물 입력]");

        System.out.print("제목: ");
        String title = br.readLine();

        System.out.print("내용: ");
        String content = br.readLine();

        System.out.print("작성자: ");
        String writer = br.readLine();


        if(checkMenu()){
            //BoardBuilder를 사용해서 새로운 객체(새 글)를 생성한다.
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
            bno++;
        }
    }

    // 2. Read : 새 글 작성, Map에 저장 기능

    // 3. Clear : 새 글 작성, Map에 저장 기능

    // 4. Exit : 새 글 작성, Map에 저장 기능

}

