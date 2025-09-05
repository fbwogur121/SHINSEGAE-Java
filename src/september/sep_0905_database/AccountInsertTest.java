package september.sep_0905_database;

/*
account.sql 테이블 확인
AA 은행에
홍길동씨가 계좌를 개설하러갔습니다.
계좌번호 : 1111-1212-3232-12121
계좌에 10만원을 입금하고 왔습니다.
계좌번호는 ano
소유주는 owner
balance 는 계좌총액
홍길동이 계좌를 개설하고
입금금액을 확인할 수 있는 자바 프로그램(AccountInsert.java)을 작성하세요
BoardInsertTest.java 참고해서 작성해 주세요
=====결과 =============
계좌번호 : 1111-1212-3232-12121
계좌주: 홍길동
계좌총액 : 100000 원
 */

import java.sql.*;

import september.vo.Person;
import util.DBUtil;
import september.vo.Account;

public class AccountInsertTest {

    public static void main(String[] args) {
        try {
            Connection con = DBUtil.getConnection();  //도로연결

            Statement stmt = con.createStatement();   //자동차
            int result = stmt.executeUpdate("INSERT INTO accounts(ano,owner,balance) values('1111-1212-3232-12121','홍길동', '100000')");
            if (result == 1) {
                System.out.println("Insert successful!");
            }


            String selectSql = "select id, name from person";
            ResultSet rs = stmt.executeQuery(selectSql);
            while(rs.next()) {
                september.vo.Account account = new Account();
                account.setAno(rs.getString(1));
                account.setOwner(rs.getString(2));
                account.setBalance(rs.getLong(3));
                System.out.println(account.toString());
            }

        } catch (Exception e) {
            System.out.println("Connection established! : " + e);
        }

    }
}
