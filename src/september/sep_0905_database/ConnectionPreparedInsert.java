package september.sep_0905_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionPreparedInsert {
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
            String sql = "INSERT INTO person(id, name) values(?, ?)";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 값 지정(세팅)
            pstmt.setInt(1, 102);
            pstmt.setString(2, "신세계");

            // sql문 실행
            int result = pstmt.executeUpdate();
            System.out.println("저장된 행의 수 : " + result);

            if(result == 1){
                System.out.println("Insert SUCCESS!!");
            }

        } catch (Exception e){
            System.out.println("Connect failed!" + e);
        }

    }
}
