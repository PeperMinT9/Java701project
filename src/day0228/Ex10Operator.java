package day0228;

import java.util.Scanner;

public class Ex10Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, days;
        System.out.println("년도 입력");
        year = sc.nextInt();
        System.out.println("월 입력");
        month = sc.nextInt();

        if(!(month >= 1 && month <= 12)) {
            System.out.println("잘못 입력했어요");
            return;
        }

        boolean leapyear = year % 4 ==0 && year % 100 != 0 || year % 400 == 0;
        if(leapyear)
            System.out.println(year + "년은 윤년입니다");
        else
            System.out.println(year + "년은 평년입니다");

//        if(month == 2) {
//            days = leapyear? 29 : 28;
//        }
//        else if(month == 4 || month == 6 || month == 9 || month == 11) {
//            days = 30;
//        }
//        else {
//            days = 31;
//        }
        // 스위치 문
        switch(month) {
            case 2:
                days = leapyear? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.printf("%d년 %d월은 %d일까지 있어요!!\n", year, month, days);
    }
}
