package day0302;

import java.util.Scanner;

public class Ex10Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu, dan;

        while(true) {
            System.out.println("1. 구구단입력후 출력 2. 전체 구구단 3. 종료");
            menu = sc.nextInt();

            if(menu == 1) {
                System.out.println("출력을 원하시는 단을 입력해주세요");
                dan = sc.nextInt();
                if(dan < 2 || dan > 9) {
                    System.out.println("범위 밖 값입니다");
                    continue;
                }
                else {
                    for (int i = 1; i < 10; i++) {
                        System.out.printf("%3d", i * dan);
                    }
                    System.out.println();
                }
            }
            else if(menu == 2) {
                for(int i = 2; i < 10; i++) {
                    for(int j = 1; j < 10; j++) {
                        System.out.printf("%3d", i * j);
                    }
                    System.out.println();
                }
            }
            else break;
        }
    }
}
