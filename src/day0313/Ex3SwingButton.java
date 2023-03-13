package day0313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3SwingButton extends JFrame {

    JButton btn1 = new JButton("버튼1");
    JButton btn2;
    JLabel lblMessage;

    public Ex3SwingButton(String title) {
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
        // 버튼, 체크박스 등등을 컴포넌트라 부른다
        // 버튼을 추가할 프레임이나 다이얼로그 등을 컨테이너라 부른다

        // 컴포넌트를 컨테이너에 추가하는 메서드 add를 통해서 부착한다
        // 기본 레이아웃이 설정: BorderLayout - 상, 하, 좌, 우, 센터
        this.add(btn1, BorderLayout.NORTH);

        btn2 = new JButton("버튼2");
//        this.add("South", btn2);
        this.add(btn2, BorderLayout.SOUTH);

        // center에는 라벨을 생성해서 넣어보자
        lblMessage = new JLabel("Hava a Nice Day!!", JLabel.CENTER);
        lblMessage.setOpaque(true); // 불투명모드, 기본은 false: 투명모드
        lblMessage.setBackground(Color.green); // 라벨 배경색 변경
        lblMessage.setForeground(Color.RED); // 라벨 글자색 변경
        lblMessage.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        this.add("Center", lblMessage);

        // 익명 내부클래스 형태로 버튼 이벤트 주기
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("Button One Click!!!");
                lblMessage.setBackground(Color.CYAN);
                lblMessage.setForeground(Color.GRAY);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("Button TWO Click!!!");
                lblMessage.setBackground(Color.BLACK);
                lblMessage.setForeground(Color.WHITE);
            }
        });
    }

    public static void main(String[] args) {
        new Ex3SwingButton("버튼생성");
    }
}
