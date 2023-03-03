package day0303;

import java.util.Random;
import java.util.Scanner;

public class Ex16Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        int temp = 0;
        Random r= new Random();

        // 금액을 입력후 금액만큼 로또 출력 (1-45 사이의 중복없는 숫자 오름차순으로 출력)
        // 단 금액이 1000원 미만이면 '금액이 부족합니다'출력 후 메인종료
        // 입력한 금액만큼(천원당 1회) 반복해서 로또 숫자 구한후 정렬한 후 출력

        System.out.printf("금액을 입력해주세요: ");
        int cycle = sc.nextInt() / 1000;
        for(int i = 0; i < cycle; i++) {
            for(int j = 0; j < 6; j++) {
                lotto[j] = r.nextInt(65) + 1;
                for(int k = 0; k < j; k++) {
                    if(lotto[j] == lotto[k]) j--;
                }
            }

            for(int j = 0; j < 6; j++) {
                for(int k = j + 1; k < 6; k++) {
                    if(lotto[j] > lotto[k]) {
                        temp = lotto[j];
                        lotto[j] = lotto[k];
                        lotto[k] = temp;
                    }
                }
            }
            System.out.printf("%d회: ", i + 1);
            for(int j = 0; j < 6; j++) {
                System.out.printf(" %3d ", lotto[j]);
            }
            System.out.println();
        }
        System.out.println("금액이 부족합니다");
    }
}
