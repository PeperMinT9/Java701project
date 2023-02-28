package day0228;

import java.util.Date;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int year, month, day, bd;
        String week;
        Scanner sc = new Scanner(System.in);
        System.out.println("태어난 연도");
        year = sc.nextInt();
        System.out.println("태어난 월");
        month = sc.nextInt();
        System.out.println("태어난 일");
        day = sc.nextInt();

        Date date = new Date(year - 1900, month - 1, day);
        bd = date.getDay();
        week = bd == 0? "일" : bd == 1? "월" : bd == 2? "화" : bd == 3? "수" : bd == 4? "목" : bd == 5? "금" : "토";
        System.out.println("당신이 태어난 날은 " + week + "요일 이었습니다");
    }
}
