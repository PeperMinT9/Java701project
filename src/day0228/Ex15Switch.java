package day0228;

import java.util.Scanner;

public class Ex15Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color, result;

        while(true) {
            System.out.println("영문 칼라명 입력");
            color = sc.nextLine();

            if(color.equalsIgnoreCase("end"))
                break;

            // 무조건 모두 소문자로 변경후 case 비교
            switch (color.toLowerCase()) {
                case "red": case "RED":
                    result = "빨강색";
                    break;
                case "blue": case "BLUE":
                    result = "파랑색";
                    break;
                case "pink": case "PINK":
                    result = "분홍색";
                    break;
                default:
                    result = "그 이외의 색";
            }
            System.out.println(color + "=>" + result);
        }
        System.out.println("** END **");
    }
}
