package day0308;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);

        this.setBounds(800, 200, 400, 400);
        this.getContentPane().setBackground(new Color(162, 184, 11));

        // 기본 레이아웃 없애기
        this.setLayout(null);
        // 버튼 생성후 이벤트주기
        JButton btn1 = new JButton("Bitcamp");
        // 버튼의 위치
        btn1.setBounds(100, 100, 100, 30);
        this.add(btn1);

        // 버튼 이벤트 - 기능을 익명 내부클래스 형태로 구현한 경우
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyFrame.this, " 버튼을 클릭했어요");
            }
        });

        this.setVisible(true);

        // 윈도우 종료 이벤트 - Ex9번의 인터페이스말고 익명내부클래스 형태로 구현
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("종료합니다");
                System.exit(0);
            }
        });
    }
}

public class Ex14WindowAnony {
    public static void main(String[] args) {
        MyFrame my = new MyFrame("Anony");
    }
}
