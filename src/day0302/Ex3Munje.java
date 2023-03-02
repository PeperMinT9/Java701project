package day0302;

import java.util.Date;
import java.util.Scanner;

public class Ex3Munje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year, month, day, week;
        String weekday;
        System.out.println("년도와 월 일을 차례대로 입력해주세요");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();

        Date date = new Date(year - 1900, month - 1, day);
        week = date.getDay();
        weekday = week == 0? "일" : week == 1? "월" : week == 2? "화" : week == 3? "수" : week == 4? "목" : week == 5? "금" : "토";
        System.out.printf("%d년 %02d월 %02d일은 %s요일 입니다", year, month, day, weekday);
    }
}
