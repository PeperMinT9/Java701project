package day0317;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex3MySQL2 {
    final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String MYSQL_URL = "jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
    static Scanner sc = new Scanner(System.in);
    public Ex3MySQL2() {
        try {
            getClass().forName(MYSQL_DRIVER);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(MYSQL_URL, "angel", "1234");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private void writeAll() { // 기능 1번
        Connection conn = this.getConnection();
        String sql = "select *, (java + spring) as sum, ROUND(((java + spring) / 2), 1) as avg from bitcamp;";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("번호 이름 자바 스프링 합계 평균 날짜");
            System.out.println("=".repeat(50));

            while(rs.next()) {
                int seq_no = rs.getInt("seq_no");
                String aname = rs.getString("name");
                int score_java = rs.getInt("java");
                int score_spring = rs.getInt("spring");
                Timestamp pub_date = rs.getTimestamp("pub_date");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); // h: 12시간 a: 오전/오후
                int sum = rs.getInt("sum");
                int avg = rs.getInt("avg");

                System.out.printf("%d   %s %d %d ", seq_no, aname, score_java, score_spring);
                System.out.printf("%d %d ", sum, avg);
                System.out.printf(dateFormat.format(pub_date) + "\n");
            }
            System.out.println();
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
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void searchName(String name) { // 기능 2번
        Connection conn = this.getConnection();
        String sql = "select *, (java + spring) as sum, ((java + spring) / 2) as avg from bitcamp WHERE name like '%" + name + "%' order by name asc";
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("번호 이름 자바 스프링 합계 평균 날짜");
            System.out.println("=".repeat(50));

            while(rs.next()) {
                int seq_no = rs.getInt("seq_no");
                String aname = rs.getString("name");
                int score_java = rs.getInt("java");
                int score_spring = rs.getInt("spring");
                Timestamp pub_date = rs.getTimestamp("pub_date");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); // h: 12시간 a: 오전/오후
                int sum = rs.getInt("sum");
                int avg = rs.getInt("avg");

                System.out.printf("%d %s %d %d ", seq_no, aname, score_java, score_spring);
                System.out.printf("%d %d ", sum, avg);
                System.out.printf(dateFormat.format(pub_date) + "\n");
            }
            System.out.println();
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
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void searchAVG(int num) { // 기능 3번
        Connection conn = this.getConnection();
        String sql = "select *, (java + spring) as sum, ((java + spring) / 2) as avg from bitcamp WHERE ((java + spring) / 2) >= " + num;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("번호 이름 자바 스프링 합계 평균 날짜");
            System.out.println("=".repeat(50));

            while(rs.next()) {
                int seq_no = rs.getInt("seq_no");
                String aname = rs.getString("name");
                int score_java = rs.getInt("java");
                int score_spring = rs.getInt("spring");
                Timestamp pub_date = rs.getTimestamp("pub_date");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); // h: 12시간 a: 오전/오후
                int sum = rs.getInt("sum");
                int avg = rs.getInt("avg");

                System.out.printf("%d %s %d %d ", seq_no, aname, score_java, score_spring);
                System.out.printf("%d %d ", sum, avg);
                System.out.printf(dateFormat.format(pub_date) + "\n");
            }
            System.out.println();
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
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void insertData() {
        System.out.println("추가할 이름은?");
        String name = sc.nextLine();
        System.out.println("추가할 바자점수는?");
        int java = Integer.parseInt(sc.nextLine());
        System.out.println("추가할 스프링점수는?");
        int spring = Integer.parseInt(sc.nextLine());

        Connection conn = this.getConnection();
        Statement stmt = null;
        String sql = "insert into bitcamp (name, java, spring, pub_date) values ('" + name + "', " +
                java + ", " + spring + ", now())";

        try {
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("데이터가 추가되었습니다");
        }
        catch (SQLException e) {
            System.out.println("insert 오류: " + e.getMessage());
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) stmt.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        Ex3MySQL2 ex3 = new Ex3MySQL2();
        int menu = -1;
        END:
        while(true) {
            System.out.println("1. 전체 출력   2. 이름검색  3. 평균검색  4.데이터 추가  5. 종료");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    ex3.writeAll();
                    break;
                case 2:
                    System.out.println("찾으시는 이름을 입력해주세요");
                    String str = sc.nextLine();
                    ex3.searchName(str);
                    break;
                case 3:
                    System.out.println("평균점수를 입력하면 그 점수 이상의 데이터만 출력합니다");
                    int anum = Integer.parseInt(sc.nextLine());
                    ex3.searchAVG(anum);
                    break;
                case 4:
                    ex3.insertData();
                    break;
                default:
                    System.out.println("시스템종료");
                    break END;
            }
        }
    }


}
