package day0308;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyHome extends JFrame implements WindowListener {
    public MyHome(String title) {
        super(title);
        this.setBounds(100, 100, 300, 300);
        // 프레임 색 변경
        this.getContentPane().setBackground(Color.cyan); // Color의 static상수들 이용
        this.getContentPane().setBackground(new Color(231, 41, 156));

        this.addWindowListener(this); // 윈도우 이벤트 발생용
        this.setVisible(true); // 프레임이 보이게 하기
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        System.exit(0); // 0: 정상 종료시
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }
}
public class Ex9Window {
    public static void main(String[] args) {
        MyHome my = new MyHome("dslkj"); // 생성자 호출
    }
}
