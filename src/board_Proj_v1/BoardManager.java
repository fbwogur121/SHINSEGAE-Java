package board_Proj_v1;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private Map<String, Board> boardMap = new LinkedHashMap<>(); // 게시판은 삭제, 갱신을 많이 하니까 linked list가 유리하다.

    // singletone 패턴 적용하여 어드민계정은 1개로 제한. 어드민 계정은 게시글 저장소를 관리한다.
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }
}
