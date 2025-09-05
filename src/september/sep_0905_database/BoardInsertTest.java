package september.sep_0905_database;

import com.mysql.cj.protocol.Resultset;

import java.io.FileInputStream;
import java.sql.*;

public class BoardInsertTest {
    public static void main(String[] args) {
        String DriverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bookmarketdb?serverTimezone=Asia/Seoul";
        String user = "root";
        String pw = "wogur121!!";

        try{
            Class.forName(DriverName);
            System.out.println("Driver loaded!");
        } catch (Exception e) {
            System.out.println("Driver loaded failed!");
        }
        try(Connection con = DriverManager.getConnection(url, user, pw)){
            System.out.println("AutoCommit 상태: " + con.getAutoCommit());
            con.setAutoCommit(true);

            // 매개변수화된 SQL문
            String sql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata) values(?,?,?,now(),?,?)";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // mysql에서 auto_increament로 만들어진 키값을 리턴받고 싶다. 옵션 추가

            // 값 지정(세팅)
            pstmt.setString(1, "봄이 오나 봄");
            pstmt.setString(2, "꽃이 동산에 가득하다");
            pstmt.setString(3, "신세계");
            pstmt.setString(4, "spring.jpg");
            pstmt.setBlob(5, new FileInputStream("/Users/fbwogur121/Desktop/신세계 I&C/spring.jpg"));

            // sql문 실행
            int result = pstmt.executeUpdate();
            System.out.println("저장된 행의 수 : " + result);

            if(result == 1){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println("bno = " + bno);
                }
                rs.close();
                System.out.println("Insert SUCCESS!!");
            }

        } catch (Exception e){
            System.out.println("Connect failed!" + e);
        }

    }
}
