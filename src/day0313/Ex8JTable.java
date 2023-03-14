package day0313;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ex8JTable extends JFrame {
    JTable table0, table1, table2;

    public Ex8JTable(String title) {
        super(title);

        // 단순히 윈도우만 종료하고 싶을때는 메서드를 통해서 종료하면 된다.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컴포넌트 생성및 이벤트 설정하기 위한 메서드.
        this.initDesign();

        this.getContentPane().setBackground(new Color(200,100,50));
        this.setBounds(900, 100, 300, 300); // x, y, w, h
        this.setVisible(true);
    }

    private void initDesign() {
        this.setLayout(new GridLayout(3, 1)); // 3행 1열

        // table 1생성
        String[] title0 = {"이름", "주소", "나이"};
        String[][] data0 = {{"이무개", "서울", "20세"}, {"아무개", "인천", "21세"}, {"박무개", "대전", "22세"}};
        table0 = new JTable(data0, title0);
        this.add(table0); // 제목 안나옴

        table1 = new JTable(data0, title0);
        this.add(new JScrollPane(table1)); // 제목 나오게 하려면 JScrollPane 사용

        // model을 이용하면 나중에라도 데이터 추가나 삭제가 가능하다
        DefaultTableModel model = new DefaultTableModel(data0, title0);
        table2 = new JTable(model);
        this.add(new JScrollPane(table2));
    }

    public static void main(String[] args) {
        new Ex8JTable("table");
    }
}
