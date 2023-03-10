package day0313;

import javax.swing.*;
import java.awt.*;

public class SwingGibon extends JFrame {

    public SwingGibon(String title) {
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
    }

    public static void main(String[] args) {
        SwingGibon ex = new SwingGibon("기본프레임");
    }
}
