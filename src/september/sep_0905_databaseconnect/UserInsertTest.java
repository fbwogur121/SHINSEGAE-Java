package september.sep_0905_databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserInsertTest {
    public static void main(String[] args) {
        String DriverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bookmarketdb?serverTimezone=Asia/Seoul";
        String username = "bookadmin";
        String password = "Bookadmin123!!";


        try{
            Class.forName(DriverName);
            System.out.println("Driver loaded!");
        } catch (Exception e) {
            System.out.println("Driver loaded failed!");
        }
        try(Connection con = DriverManager.getConnection(url, username, password)){
            System.out.println("AutoCommit 상태: " + con.getAutoCommit());
            con.setAutoCommit(true);

            // 매개변수화된 SQL문
            String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) values(?, ?, ?, ?, ?)";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 값 지정(세팅)
            pstmt.setInt(1, 104);
            pstmt.setString(2, "신세계");
            pstmt.setString(3, "ssgpw");
            pstmt.setInt(4, 25);
            pstmt.setString(5, "ssg@gmail.com");

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
