package day0302;

import java.util.Scanner;

public class Ex9Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        int su1, su2;
        int result = 0;

        Exit:
        while(true) {
            System.out.println("   ** 메뉴 **   ");
            System.out.println("1. 숫자 입력후 1부터 그 숫자까지 합계 구하기");
            System.out.println("2. 2가지 숫자 입력후 숫자1에서 숫자2까지 합계구하기");
            System.out.println("3. 팩토리얼 구하기");
            System.out.println("4. 두개의 숫자 입력후 su1의 su2승 구하기");
            System.out.println("5. 종료");

            menu = sc.nextInt();
            System.out.printf("%d번 선택\n", menu);
            switch(menu) {
                case 1:
                    result = 0;
                    su1 = sc.nextInt();
                    for(int i = 0; i <= su1; i++) {
                        result += i;
                    }
                    System.out.println(result);
                    break;
                case 2:
                    result = 0;
                    su1 = sc.nextInt();
                    su2 = sc.nextInt();
                    if(su1 > su2) {
                        for(int i = su2; i <= su1; i++) {
                            result += i;
                        }
                    }
                    else {
                        for(int i = su1; i <= su2; i++) {
                            result += i;
                        }
                    }
                    System.out.println(result);
                    break;
                case 3:
                    result = 1;
                    su1 = sc.nextInt();
                    for(int i = 1; i <= su1; i++) {
                        result *= i;
                    }
                    System.out.println(result);
                    break;
                case 4:
                    su1 = sc.nextInt();
                    su2 = sc.nextInt();
                    result = 1;
                    for(int i = 0; i < su2; i++) {
                        result *= su1;
                    }
                    System.out.println(result);
                    break;
                default:
                    System.out.println("프로그램종료");
                    break Exit; // while 문을 빠져나온다
            }
        }

    }
}
