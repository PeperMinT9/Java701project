package day0228;

import java.util.Scanner;
import java.util.StringTokenizer;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0, cm0 = 0, cm1 = 0;
        System.out.println("    ** 메뉴 **    ");
        System.out.println("1. 원의 넓이 구하기");
        System.out.println("2. 사각형의 넓이 구하기");

        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("반지름을 입력하시오");
                cm0 = sc.nextInt();
                System.out.println(cm0 * cm0 * Math.PI);
                break;
            case 2:
                System.out.println("가로 길이를 입력하시오");
                cm0 = sc.nextInt();
                System.out.println("세로 길이를 입력하시오");
                cm1 = sc.nextInt();
                System.out.println(cm0 * cm1);
                break;
        }
    }
}
