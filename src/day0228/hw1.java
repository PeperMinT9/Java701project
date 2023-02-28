package day0228;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int sum = 0, counter = 0, num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("점수를 입력하시오(0 입력시 종료)");
            num = sc.nextInt();
            if(num == 0) break;
            else {
                sum += num;
                counter += 1;
            }
        }
        System.out.println("합계: " + sum + "  입력횟수: " + counter);
    }
}
