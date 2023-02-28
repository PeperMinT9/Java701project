package day0228;

import java.util.Scanner;

public class Ex7Operator {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        System.out.println("당신의 월 급여는");
        money = sc.nextInt();
        int man = money  / 10000;
        int thou = money % 10000 / 1000;
        int bag = money % 10000 % 1000 / 100;
        int ten = money % 10000 % 1000 % 100 / 10;
        int one = money % 10000 % 1000 % 100 % 10;
        System.out.printf("%d만 %d천 %d백 %d십 %d원", man, thou, bag, ten, one);
    }
}
