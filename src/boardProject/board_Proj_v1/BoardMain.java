package boardProject.board_Proj_v1;

import java.io.IOException;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        BoardManager boardManager = new BoardManager();
        BoardExample boards = new BoardExample(boardManager);
        try {
            boards.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
