package day0302;

import java.util.Date;
import java.util.Scanner;

public class Ex14Calendar {
    public static void main(String[] args) {
        // 년도와 월을 입력시 해당 달력을 출력하시오
        Scanner sc = new Scanner(System.in);

        int year, month, endday, day, point = 1;
        String week;

        System.out.println("년도와 월 입력하기");
        year = sc.nextInt();
        month = sc.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("월 입력을 잘못했어요(1-12)");
            return; // 메인메서드 종료
        }

        System.out.printf("%d년 %2d월 달력\n\n", year, month);
//        System.out.println("일\t월\t화\t수\t목\t금\t토\t");
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s", "일","월","화","수","목","금","토");
        System.out.println();

        switch (month) {
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 300 == 0)
                    endday = 29;
                else
                    endday = 28;
                break;
            case 4, 6, 9, 11:
                endday = 30;
                break;
            default:
                endday = 31;
                break;

        }

        Date date = new Date(year-1900, month-1, 1);
        day = date.getDay();
        week = day == 0? "일" : day == 1? "월" : day == 2? "화" : day == 3? "수" : day == 4? "목" : day == 5? "금" : "토";
        for(int i = 0; i < day; i++) {
            System.out.printf("%3s", "");
        }
        while(point <= endday) {
            System.out.printf("%3s", Integer.toString(point));
            if(point % 7 == 7 - day) {
                System.out.println();
            }
            point++;
        }
    }
}
