package day0320;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex1MySqlSawonCRUD {
    final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String MYSQL_URL = "jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
    static Scanner sc = new Scanner(System.in);
    public Ex1MySqlSawonCRUD() {
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

    private int getMenu() {
        int menu = 0;
        System.out.println("=".repeat(60));
        System.out.println(" ** Sawon DB Menu ** ");
        System.out.println("1. 사원 추가");
        System.out.println("2. 전체 사원 출력");
        System.out.println("3. 이름으로 검색");
        System.out.println("4. 이름으로 삭제");
        System.out.println("5. 시퀸스번호로 수정");
        System.out.println("6. 남여 성별로 분석");
        System.out.println("7. 부서별 분석");
        System.out.println("8. 종 료");

        menu = Integer.parseInt(sc.nextLine());

        return menu;
    }

    // 사원 추가
    private void addSawon() {
        System.out.println("추가할 사원명은?");
        String name = sc.nextLine();
        System.out.println("사원 점수는?");
        int score = Integer.parseInt(sc.nextLine());
        System.out.println("성별 선택 1. 남자  2. 여자");
        int gidx = Integer.parseInt(sc.nextLine());
        if(!(gidx == 1 | gidx == 2)) {
            System.out.println("잘못입력하였습니다");
            return;
        }
        String gender = gidx == 1? "남자":"여자";

        Connection conn = this.getConnection();
        Statement stmt = null;
        String sql = "insert into sawon (name, score, gender) values ('" +
                name + "', " + score + ", '" + gender + "')";

        try {
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("데이터 추가완료");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 전체 사원 출력
    private void writeSawon() {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from sawon";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println(" ** 전체 사원 출력 ** ");

            while(rs.next()) {
                int num = rs.getInt("num");
                String aname = rs.getString("name");
                int score = rs.getInt("score");
                String gender = rs.getString("gender");
                String buseo = rs.getString("buseo");

                System.out.printf("%d\t%s\t%d\t%s\t%s\n", num, aname, score, gender, buseo);
            }
            System.out.println();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 이름으로 검색
    private void searchSawonName() {
        System.out.println("검색할 사원명을 입력하세요");
        String searchName = sc.nextLine();

        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs =null;
        String sql = "select * from sawon where name ='" + searchName +"'";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("\"" + searchName + "\" 사원검색결과");
            while(rs.next()) {
                System.out.println("-----------------------");
                System.out.println("성별: " + rs.getString("gender"));
                System.out.println("부서명: " + rs.getString("buseo"));
                System.out.println("점수:" + rs.getInt("score"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 이름으로 삭제
    private void deleteSawonName() {
        System.out.println("삭제할 사원명을 입력하세요");
        String name = sc.nextLine();

        Connection conn = this.getConnection();
        Statement stmt = null;
        String sql = "delete from sawon where name ='" + name + "'";

        try {
            conn = getConnection();
            int n = stmt.executeUpdate(sql); // 반환타입: 성공적으로 삭제된 데이터의 갯수

            if(n == 0)
                System.out.println("사원중 " + name + "님은 없습니다");
            else
                System.out.println("총 " + n + "명의 " + name + "님이 있습니다");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 시퀸스 번호로 수정
    private void updateSawonNum() {
        System.out.println("수정할 시퀸스 번호를 입력하세요");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("수정할 이름은?");
        String name = sc.nextLine();
        System.out.println("수정할 부서는?");
        String buseo = sc.nextLine();

        Connection conn = this.getConnection();
        Statement stmt = null;
        String sql = "update sawon set name = '" + name +
                "', buseo = '" + buseo + "' where num = " + num;

        try {
            stmt = conn.createStatement();
            int n = stmt.executeUpdate(sql); // 반환타입: 성공적으로 삭제된 데이터의 갯수

            if(n == 0)
                System.out.println("사원중 " + num + "번은 없습니다");
            else
                System.out.println(num + "번 변경완료");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 남여 분석
    private void analysisGender() {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select gender, count(*) as count, round(avg(score), 1) as " +
                "avg from sawon group by gender";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("성별\t인원수\t평균");
            while(rs.next()) {
                String gender = rs.getString("gender");
                int count = rs.getInt("count");
                double avg = rs.getDouble("avg");

                System.out.printf("%s\t%d\t%f\n", gender, count, avg);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    // 부서별 분석
    private void analysisBuseo() {
        Connection conn = this.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select buseo, count(*) as count, round(avg(score), 1) as " +
                "avg from sawon group by buseo";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("부서\t인원수\t평균");
            while(rs.next()) {
                String buseo = rs.getString("buseo");
                int count = rs.getInt("count");
                double avg = rs.getDouble("avg");

                System.out.printf("%s\t%d\t%f\n", buseo, count, avg);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        Ex1MySqlSawonCRUD ex = new Ex1MySqlSawonCRUD();
        while (true) {
            switch (ex.getMenu()) {
                case 1:
                    ex.addSawon();
                    break;
                case 2:
                    ex.writeSawon();
                    break;
                case 3:
                    ex.searchSawonName();
                    break;
                case 4:
                    ex.deleteSawonName();
                    break;
                case 5:
                    ex.updateSawonNum();
                    break;
                case 6:
                    ex.analysisGender();
                    break;
                case 7:
                    ex.analysisBuseo();
                    break;
                default:
                    System.out.printf(" **  사원 DB 프로그램을 종료합니다 ** ");
                    System.exit(0);

            }
        }
    }
}
