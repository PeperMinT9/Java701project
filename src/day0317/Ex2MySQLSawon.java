package day0317;

import java.sql.*;

public class Ex2MySQLSawon {
    final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String MYSQL_URL = "jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";


    public Ex2MySQLSawon() {
        try {
            getClass().forName(MYSQL_DRIVER);
            System.out.println("MySQL 드라이버 성공");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL 드라이버 실패: " + e.getMessage());
        }
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(MYSQL_URL, "angel", "1234");
            System.out.println("로컬 MYSQL 연결 성공");
        }
        catch (SQLException e) {
            System.out.println("로컬 MYSQL 연결 실패: " + e.getMessage());
        }
        return conn;
    }

    public void writeSawon() {
        Connection conn = this.getConnection();
        String sql = "select sawon.num, name, gender, buseo, age, pn, addr, score" +
                "  from sawon, sawoninfo as info where sawon.num = info.num";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int num = rs.getInt("num");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String buseo = rs.getString("buseo");
                int age = rs.getInt("age");
                String pn = rs.getString("pn");
                String addr = rs.getString("addr");
                int score = rs.getInt("score");

                System.out.printf(" ** %s 사원의 개인정보 ** \n", name);
                System.out.printf("num = %d, score = %d\n", num, score);
                System.out.printf("부서명: %s, 성별: %s\n", buseo, gender);
                System.out.printf("주소: %s, 핸드폰: %s\n", addr, pn);
                System.out.printf("나이 %d\n", age);
                System.out.println("=".repeat(30));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) {}
        }
    }

    public void countSawon() {
        Connection conn = this.getConnection();
        String sql = "select count(*) from sawon, sawoninfo where sawon.num = sawoninfo.num";
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            rs.next();
            System.out.println("총 " +rs.getInt("count(*)") + "명 입니다.");
        }
        catch (SQLException e) { e.printStackTrace(); }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
            catch (Exception e) { e.printStackTrace(); }
        }
    }

    private void analysis() {
        String sql = "SELECT buseo, count(*) as count, round(avg(score), 1) as avgscore," +
                "  max(score) as maxscore, min(score) as minscore from sawon GROUP BY buseo";
        System.out.println("부서명 인원수 평균점수 최고점수 최저점수");
        System.out.println("=".repeat(40));

        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String bu = rs.getString("buseo");
                int cnt = rs.getInt("count");
                double as = rs.getDouble("avgScore");
                int mxs = rs.getInt("maxscore");
                int mis = rs.getInt("minscore");
                System.out.printf("%s  %d  %f  %d  %d\n", bu, cnt, as, mxs, mis);
                System.out.println("=".repeat(30));
            }
        }
        catch (SQLException e) {
           e.printStackTrace();
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
            catch (Exception e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        Ex2MySQLSawon ex2 = new Ex2MySQLSawon();
        ex2.writeSawon();
        ex2.countSawon();
        ex2.analysis();
    }


}
