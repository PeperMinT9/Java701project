package day0317;

import oracle.jdbc.internal.XSCacheOutput;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex1OracleShop {
    static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    final static String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
//    final static String ORACLE_URL = "jdbc:oracle:thin:@192.168.0.24:1521:xe"; // 강사 pc

    Ex1OracleShop() {
        try {
            Class.forName(ORACLE_DRIVER);
            System.out.println("오라클 드라이버 적용 성공");
        }
        catch (ClassNotFoundException e){
            System.out.println("오라클 드라이버 실패" + e.getMessage());
        }
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(ORACLE_URL, "angel", "a1234");
            System.out.println("로컬 오라클 연결 성공");
        }
        catch (SQLException e) {
            System.out.println("로컬 오라클 연결 실패: " + e.getMessage());
        }
        return conn;
    }

    public void writeShop() {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from shop order by num";
        try {
            stmt = conn.createStatement();
            // 데이터를 가져오는 select 문은 무조건 executeQuery()로 sql문을 실행한다
            rs = stmt.executeQuery(sql);

            // rs.next() 다음 레코드로 이동, 다음 데이터가 있으면 true, 없으면 false
            while(rs.next()) {
                int num = rs.getInt(1); // 컬럼번호로 가져와도 되고 컬럼명도 가능
                String sangpum = rs.getString(2);

                int su = rs.getInt("su");
                int dan = rs.getInt("dan");
                String color = rs.getString("color");
                // String today = rs.getString("today");
                Timestamp today = rs.getTimestamp("today");
                // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd EEEE"); // xx:xx:xx
                // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // XX:XX 24시간
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm"); // h: 12시간 a: 오전/오후

                System.out.println(num + "\t" + sangpum + "\t" + su + "\t" + dan +
                        "\t" + color + "\t" + dateFormat.format(today));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) {

            }
        }
    }

    private void searchShop(String qu) {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String quest = "\'%\'||\'" + qu + "\'||\'%\'";
        String sql = "select * from shop where SANGPUM like " + quest;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("상품명   색상  수량  단가   날짜");
            System.out.println("=".repeat(30));

            while(rs.next()) {
                int num = rs.getInt(1);
                String sangpum = rs.getString(2);
                int su = rs.getInt("su");
                int dan = rs.getInt("dan");
                String color = rs.getString("color");
                Timestamp today = rs.getTimestamp("today");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
                System.out.println(num + "\t" + sangpum + "\t" + su + "\t" + dan +
                        "\t" + color + "\t" + dateFormat.format(today));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) {

            }
        }
    }

    private int searchCount(String qu) {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String quest = "\'%\'||\'" + qu + "\'||\'%\'";
        String sql = "select count(*) as cnt from shop where SANGPUM like " + quest;
        System.out.println(sql);
        int tn = 0;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            rs.next();
            tn = rs.getInt("cnt");
            System.out.println(tn);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) {

            }
        }
        return tn;
    }

    public static void main(String[] args) {
        Ex1OracleShop ex1 = new Ex1OracleShop();
//        ex1.writeShop();
        Scanner sc = new Scanner(System.in);
        String qu = null;
        while(true) {
            System.out.println("검색 하려는 값을 입력하시오 / exit 입력시 종료");
            qu = sc.nextLine();
            if (qu.equalsIgnoreCase("exit")) break;

            int totalCount = ex1.searchCount(qu);
            if (totalCount == 0) {
                System.out.println(qu + "상품은 없습니다");
                continue;
            }
            ex1.searchShop(qu);
        }

    }




}
