package day0302;

import java.util.Random;

public class Ex12Random {
    public static void main(String[] args) {
        // 1.Math.random()
        for(int i = 0; i < 5; i++) {
//            double r = Math.random();
//            System.out.println(r);
            int r = (int)(Math.random() * 10);
            System.out.println(r);
        }
        System.out.println("=".repeat(20));
        // 2. Random 클래스
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            int r = random.nextInt(10); // 0~9사이의 난수
            System.out.println(r);
        }
        System.out.println("=".repeat(20));
        for(int i = 0; i < 5; i++) {
            int r = random.nextInt(26) + 65; // A-Z(65-90)
            System.out.println((char)r);
        }
    }
}
