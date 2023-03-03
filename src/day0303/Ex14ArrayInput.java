package day0303;

import java.util.Scanner;

public class Ex14ArrayInput {
    public static void main(String[] args) {
        int[] score, rank;
        int count, temp;
        int total = 0;
        double avg;

        // 입력할 점수의 갯수를 입력받아 그 갯수만큼 배열을 할당받은 후
        // 점수를 입력받아 합계와 평균을 구해보자
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 점수 갯수 입력");
        count = sc.nextInt();
        score = new int[count];
        rank = new int[count];
        for(int i = 0; i < count; i++) {
            System.out.printf("점수를 입력하세요: ");
            temp = sc.nextInt();
            score[i] = temp;
            total += temp;
            System.out.printf("%d번째 점수는 %d입니다\n", i, temp);
        }
        avg = total / count;
        for(int i = 0; i < count; i++) {
            System.out.printf("%d번째 점수는 %d입니다\n", i, score[i]);
        }
        for(int i = 0; i < count; i++) {
            rank[i] = 1;
            for(int j = 0; j < count; j++) {
                if(score[i] < score[j]) rank[i]++;
            }
        }
        for(int i = 0; i < count; i++) {
            System.out.printf("%d번째 점수는 %d입니다\n", i, score[i]);
        }
        System.out.printf("총점: %d,   평균: %f\n", total, avg);
        System.out.println("점수 오름차순");
        for(int i = 0; i < count; i++) {
            System.out.printf("%d 점수는 %d번째입니다\n", score[i], rank[i]);
        }
    }
}
