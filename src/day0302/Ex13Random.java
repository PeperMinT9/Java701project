package day0302;

import java.util.Random;
import java.util.Scanner;

public class Ex13Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
//        1 ~ 100 사이의 난수를 10회 이내에 맞추기
//        정답을 맞추면 계속하려면 y 그만하려면 n
        Loop1:
        while(true) {
            int num = (int)(r.nextInt(100) + 1);
            System.out.printf("%d\n", num);
            int sol;
            for(int i = 0; i < 10; i++) {
                System.out.printf("예상되는 수를 입력해주세요 %d회 남았습니다", 10-i);
                sol = Integer.parseInt(sc.nextLine());
                if(num > sol) {
                    System.out.println("정답보다 작습니다");
                }
                else if(num < sol) {
                    System.out.println("정답보다 큽니다");
                }
                else {
                    System.out.println("정답입니다!!");
                    System.out.println("계속하시겠습까? (y)es (n)o");
                    String a = sc.nextLine();
                    if(a == "y") {
                        continue Loop1;
                    }
                    else {
                        break Loop1;
                    }
                }
                if(i == 9) {
                    System.out.println("횟수 초과!! 현재 게임은 종료");
                    System.out.println("계속하시겠습까? (y)es (n)o");
                    String a = sc.nextLine();
                    if(a == "y") {
                        continue Loop1;
                    }
                    else {
                        break Loop1;
                    }
                }
            }

        }
    }
}
