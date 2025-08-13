package august.aug_0813.dataStructure.classRoom;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        // 글 하나를 작성하여 게시판에 올립니다.
        boardList.add(new Board("컬렉션 학습 1째날", "쉽지 않아요1", "sym1"));
        boardList.add(new Board("컬렉션 학습 2째날", "쉽지 않아요2", "sym2"));
        boardList.add(new Board("컬렉션 학습 3째날", "쉽지 않아요3", "sym3"));
        boardList.add(new Board("컬렉션 학습 4째날", "쉽지 않아요4", "sym4"));

        // 현재 게시판의 글 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);
        for (Board board : boardList) {
            System.out.print("제목 : " + board.getSubject());
            System.out.print(" | 내용 : " + board.getContent());
            System.out.println(" | 글쓴이 : " + board.getWriter());
            System.out.println("==========================================================");
        }

        // 특정 인덱스의 객체 가져오기
        Board board = boardList.get(2);
        System.out.print("제목 : " + board.getSubject());
        System.out.print(" | 내용 : " + board.getContent());
        System.out.println(" | 글쓴이 : " + board.getWriter());

        // 특정 인덱스의 객체 삭제
        boardList.remove(2);
        Board board2 = boardList.get(2);
        System.out.print("제목 : " + board2.getSubject());
        System.out.print(" | 내용 : " + board2.getContent());
        System.out.println(" | 글쓴이 : " + board2.getWriter());
    }
}
