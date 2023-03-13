package day0313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class hw1 extends JFrame {
    JComboBox<String> dtype;
    JComboBox<String> dcolor;
    String color = "Black";
    Image image;
    String imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\00.jpg";
    MyPhoto2 my = new MyPhoto2();

    public hw1(String title) {
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
        JPanel p = new JPanel();

        this.add("Center", my);

        String[] draw_type = {"Circle", "Rectangle", "Photo", "STR"};
        String[] color_type = {"RED", "YELLOW", "PINK", "GREEN"};

        dtype = new JComboBox<>(draw_type);
        dcolor = new JComboBox<>(color_type);

        p.add(dtype);
        p.add(dcolor);
        this.add("North", p);

        dcolor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (dcolor.getSelectedIndex()) {
                    case 0:
                        System.out.println("RED");
                        my.setCs(0);
                        break;
                    case 1:
                        System.out.println("YELLOW");
                        my.setCs(1);
                        break;
                    case 2:
                        System.out.println("PINK");
                        my.setCs(2);
                        break;
                    case 3:
                        System.out.println("GREEN");
                        my.setCs(3);
                        break;
                    default:
                        break;
                }
            }
        });

        dtype.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (dtype.getSelectedIndex()) {
                    case 0:
                        System.out.println("Circle");
                        image = new ImageIcon("").getImage();
                        my.setSelector(0);
                        my.repaint();
                        break;
                    case 1:
                        System.out.println("Rectangle");
                        image = new ImageIcon("").getImage();
                        my.setSelector(1);
                        my.repaint();
                        break;
                    case 2:
                        System.out.println("Photo");
                        image = new ImageIcon("").getImage();
                        image = new ImageIcon(imageName).getImage();
                        my.setSelector(2);
                        my.repaint();
                        break;
                    case 3:
                        System.out.println("STR");
                        image = new ImageIcon("").getImage();
                        my.setSelector(3);
                        my.repaint();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private class MyPhoto2 extends Canvas {
        int selector = -1;
        int cs = -1;
        public void setSelector(int selector) {
            this.selector = selector;
        }
        public void setCs(int cs) {
            this.cs = cs;
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            switch (cs) {
                case 0:
                    g.setColor(Color.RED);
                    break;
                case 1:
                    g.setColor(Color.YELLOW);
                    break;
                case 2:
                    g.setColor(Color.PINK);
                    break;
                case 3:
                    g.setColor(Color.GREEN);
                    break;
            }

            switch (selector) {
                case 0:
                    g.drawOval(100, 100, 30, 30);
                    break;
                case 1:
                    g.drawRect(100, 100, 30, 30);
                    break;
                case 2:
                    g.drawImage(image, 0, 0, 300, 350, this);
                    break;
                case 3:
                    g.drawString("이게 되나?", 50, 50);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new hw1("hw1");
    }
}
