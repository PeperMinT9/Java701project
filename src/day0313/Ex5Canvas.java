package day0313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class Ex5Canvas  extends JFrame {
    // 내부클래스인 MyDraw를 생성
    MyDraw draw = new MyDraw();

    // 사각형의 초기 색상
    Color initColor = new Color(239, 136, 190);

    public Ex5Canvas(String title) {
        super(title);

        // 단순히 윈도우만 종료하고 싶을때는 메서드를 통해서 종료하면 된다.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컴포넌트 생성및 이벤트 설정하기 위한 메서드.
        this.initDesign();

        this.getContentPane().setBackground(new Color(200,100,50));
        this.setBounds(900, 100, 300, 300); // x, y, w, h
        this.setVisible(true);
    }

    // Canvas를 상속받는 내부클래스
    public class MyDraw extends Canvas {
        String imgPath1 = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\00.jpg";
        String imgPath2 = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\01.jpg";
        @Override
        public void paint(Graphics g) { // 처음 생성시 & 프레임 변경시 자동호출, 강제호출 repaint()
            System.out.println("paint 호출");
            super.paint(g);

            g.setColor(Color.magenta);
            g.drawOval(30, 30, 100, 100);

            g.setColor(Color.green);
            g.fillOval(150, 30, 100, 100);

            g.setColor(initColor);
            g.fillRect(200, 180, 40, 50);

            g.drawRect(50, 180, 100, 120);

            // 캔버스에 이미지를 그리는 두가지 방법
            Image img = new ImageIcon(imgPath1).getImage();
            g.drawImage(img, 30, 300, 100, 100, this);

            Image img2 = Toolkit.getDefaultToolkit().getImage(imgPath2);
            g.drawImage(img2,350, 30, 100, 100, this);
        }
    }

    private void initDesign() {
        // center에 draw추가
        this.add("Center", draw);

        JPanel p = new JPanel();

        JRadioButton rb1 = new JRadioButton("핑크", true);
        JRadioButton rb2 = new JRadioButton("초록");
        JRadioButton rb3 = new JRadioButton("오렌지");

        // Radio 버튼 3개를 그룹으로 묶는다.
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        // 패널에 추가
        p.add(rb1);
        p.add(rb2);
        p.add(rb3);

        this.add("North", p);

        // 라디오 버튼 이벤트는 익명 내부 클래스 형태로 만듬
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 색상 변경
                initColor = new Color(239, 136, 190);
                // 캔바스의 paint 강제호출
                draw.repaint();
            }
        });
        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 색상 변경
                initColor = new Color(22, 239, 112);
                // 캔바스의 paint 강제호출
                draw.repaint();
            }
        });
        rb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 색상 변경
                initColor = new Color(239, 120, 5);
                // 캔바스의 paint 강제호출
                draw.repaint();
            }
        });
    }

    public static void main(String[] args) {
        new Ex5Canvas("Canvas");
    }
}
