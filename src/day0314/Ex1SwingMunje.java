package day0314;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.Vector;

public class Ex1SwingMunje  extends JFrame {
    MyCanvas myCanvas = new MyCanvas();
    JComboBox<String> comboShape;
    JComboBox<String> comboColor;

    int shape = 2;
    Color selectColor = Color.orange;
    Image image;
    String imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\00.jpg";

    public Ex1SwingMunje(String title) {
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
        String[] shapeArray = {"원", "사각형", "이미지", "문자열"};
        Vector<String> colorList = new Vector<>();
        colorList.add("빨강");
        colorList.add("오렌지");
        colorList.add("핑크");
        colorList.add("노랑");
        colorList.add("회색");
        // Vector<String> colorList = (Vector<String>)Arrays.asList("빨강", "오렌지", "핑크", "노랑", "회색");

        comboShape = new JComboBox<>(shapeArray);
        comboColor = new JComboBox<>(colorList);

        JPanel p = new JPanel();
        p.add(comboShape);
        p.add(comboColor);

        this.add("North", p);
        this.add("Center", myCanvas);

        comboShape.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                shape = comboShape.getSelectedIndex();
                myCanvas.repaint();
            }
        });

        comboShape.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (comboColor.getSelectedIndex()) {
                    case 0:
                        selectColor = Color.red;
                        break;
                    case 1:
                        selectColor = Color.pink;
                        break;
                    case 2:
                        selectColor = Color.green;
                        break;
                    case 3:
                        selectColor = Color.gray;
                        break;
                    case 4:
                        selectColor = Color.yellow;
                        break;
                }
                myCanvas.repaint();
            }
        });
    }

    private class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.setColor(selectColor);

            switch (shape) {
                case 0:
                    g.fillOval(100, 100, 130, 130);
                    break;
                case 1:
                    g.fillRect(100, 100, 130, 130);
                    break;
                case 2:
                    image = new ImageIcon(imageName).getImage();
                    g.drawImage(image, 0, 0, 300, 320, this);
                    break;
                case 3:
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString("asdf", 50, 100);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Ex1SwingMunje("문제복습");
    }


}
