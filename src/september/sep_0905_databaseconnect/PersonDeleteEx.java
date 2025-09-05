package september.sep_0905_databaseconnect;


/*
JDBC를 이용해서 데이터삭제를 하는 DELETE문을 실행하는 방법
DELETE FROM 테이블명; 해당 테이블의 모든 행을 지운다
DELETE FROM 테이블명 WHERE id=식별값; // 해당 식별값의 행만 지운다
DELETE FROM person WHERE num = 1; // person 테이블의 pk num = 1 인 행을 삭제한다
String sql = "DELETE FROM person WHERE NUM = ?"; // 바뀌는 값은 num 값.
 */

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PersonDeleteEx {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        // SQL문 작성
        String sql = "DELETE FROM person WHERE num = ?";

        // PreperedStatement 생성하고 값 지정
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1,2);
            int rows = pstm.executeUpdate();
            System.out.println("삭제된 행의 수 : " + rows);

        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
