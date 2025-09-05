package september.sep_0905_databaseconnect;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import september.sep_0905_databaseconnect.vo.Person;

public class PersonUpdateEx {
    public static void main(String[] args) {
        Connection connection = DBUtil.getConnection();

        // 매개변수화된 UPDATE SQL문 작성
        String sql = new StringBuilder()
                .append("UPDATE PERSON SET ")
                .append("id = ? , ")
                .append("name = ? ")
                .append("WHERE num = ?").toString();

        // PrepareStatement 객체 생성하고 값 지정
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setInt(1, 150);
            pstmt.setString(2, "213도우너");
            pstmt.setInt(3, 3);

            // SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "rows updated!");

            String selectSql = "select id, name from person";
            ResultSet rs = pstmt.executeQuery(selectSql);
            while (rs.next()){
                Person person = new Person();
                person.setId(rs.getInt(1));
                person.setName(rs.getString(2));
                System.out.println(person.getId()+" "+ person.getName());
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
