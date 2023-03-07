package day0306;

import java.util.Scanner;

public class Ex1Array2Cha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        int[][] scores = new int[3][5];

        // 입력
        int names_length = names.length;
        int score_length = scores.length;
        for(int i = 0; i < names_length; i++) {
            System.out.println(i + "번의 이름은?");
            names[i] = sc.nextLine();

            System.out.println("3과목의 점수를 입력해주세요");
            for(int j = 0; j < score_length; j++) {
                scores[i][j] = sc.nextInt();
            }
            // 마지막 점수 입력후 버퍼에 저장된 엔터를 따로 읽어서 처리한다
            sc.nextLine();
        }

        // 총점구하기
        for(int i = 0; i < score_length; i++) {
            for(int j = 0; j < score_length; j++) {
                scores[i][3] += scores[i][j];
            }
        }

        // 등수구하기
        for(int i = 0; i < score_length; i++) {
            scores[i][4] = 1;
            for(int j = 0; j < score_length; j++) {
                if(scores[i][3] < scores[j][3]) {
                    scores[i][4]++;
                }
            }
        }

        // 출력
        System.out.println("이름\t국어\t영어\t수학\t총점");
        System.out.println("=".repeat(30));
        for(int i = 0; i < names_length; i++) {
            System.out.printf("%-10s", names[i]);

            for(int j = 0; j < scores[i].length; j++) {
                System.out.printf("%5d", scores[i][j]);
            }
            System.out.println();
        }

    }
}
