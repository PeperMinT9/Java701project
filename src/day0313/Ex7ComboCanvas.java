package day0313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex7ComboCanvas  extends JFrame {
    MyPhoto my = new MyPhoto();
    Image image;
    String imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\00.jpg";
    JComboBox<String> combo;

    public Ex7ComboCanvas(String title) {
        super(title);

        // 단순히 윈도우만 종료하고 싶을때는 메서드를 통해서 종료하면 된다.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컴포넌트 생성및 이벤트 설정하기 위한 메서드.
        this.initDesign();

        this.getContentPane().setBackground(new Color(200,100,50));
        this.setBounds(900, 100, 300, 400); // x, y, w, h
        this.setVisible(true);
    }

    private void initDesign() {
        image = new ImageIcon(imageName).getImage();

        this.add("Center", my);

        String[] data = {"사진0", "사진1", "사진2", "사진3", "사진4", "사진5"};
        combo = new JComboBox<>(data);

        JPanel p = new JPanel();
        p.add(combo);
        this.add("North", p);

        // combo 이벤트
        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
//                System.out.println(combo.getSelectedIndex());
//                System.out.println(combo.getSelectedItem());
                switch (combo.getSelectedIndex()) {
                    case 0:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\01.jpg";
                        break;
                    case 1:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\02.jpg";
                        break;
                    case 2:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\03.jpg";
                        break;
                    case 3:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\04.jpg";
                        break;
                    case 4:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\05.jpg";
                        break;
                    case 5:
                        imageName = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\06.jpg";
                        break;
                    default:
                        break;
                }

                // image얻기
                image = new ImageIcon(imageName).getImage();
                // paint 호출
                my.repaint();
            }
        });
    }

    class MyPhoto extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            // 이미지 그리기
            g.drawImage(image, 0, 0, 300, 350, this);
        }
    }
    public static void main(String[] args) {
        new Ex7ComboCanvas("이미지선택");
    }
}
