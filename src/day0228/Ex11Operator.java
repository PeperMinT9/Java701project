package day0228;

import java.util.Scanner;

public class Ex11Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        String msg;
        System.out.println("점수입력");
        score = sc.nextInt();

        msg = score >= 90? "참잘했어요" : "노력하세요";
        System.out.println(score + "점 => " + msg);

        // msg에 90이상이면 'A'그룹 80이상이면 'B' 그룹 그외 'C'그룹
        // 90점은 A그룹입니다
        score = sc.nextInt();
        msg = score >= 90? "A" : score >= 80? "B" : "C";
        System.out.println(score + "점은 " + msg + "그룹입니다");

        // msg에 90이상이면 'A'그룹 80이상이면 'B' 그룹 그외 'C'그룹
        score = sc.nextInt();
        msg = score >= 90? "A" : score >= 80? "B" : score >= 70? "C" : score >= 60? "D" : "F";
        System.out.println(score + "점은 " + msg + "학점입니다");
    }
}
