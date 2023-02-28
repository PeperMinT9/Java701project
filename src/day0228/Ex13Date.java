package day0228;

import java.util.Date;
import java.util.Scanner;

public class Ex13Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day;
        String week;
//        년도의 월을 입력하면 그 달의 1일이 무슨 요일인지 출력해보자
        System.out.println("년도 입력");
        year = sc.nextInt();
        System.out.println("월 입력");
        month = sc.nextInt();

        Date date = new Date(year-1900, month-1, 1);
        day = date.getDay();
        week = day == 0? "일" : day == 1? "월" : day == 2? "화" : day == 3? "수" : day == 4? "목" : day == 5? "금" : "토";

        System.out.printf("%d년 %d월 1일은 %s요일입니다", year, month, week);
    }
}
