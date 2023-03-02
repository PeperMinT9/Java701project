package day0302;

import java.util.Scanner;

public class Ex1Munje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        int count = 0, sum = 0;
        while (true) {
            System.out.println("점수입력");
            score = sc.nextInt();
            if(score == 0) break;
            count++;
            sum += score;
        }
        System.out.println("총 입력갯수:" + count);
        System.out.println("총 합계:" + sum);
    }
}
