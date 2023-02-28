package day0228;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("상품명");
        String pn = sc.nextLine();
        System.out.println("수량");
        int qn = sc.nextInt();
        System.out.println("단가");
        int price = sc.nextInt();
        System.out.println("총 " + (qn * price) + " 원");
        if (qn >= 5) {
            System.out.println("10프로 할인된 금액 " + (qn * price) * 0.9 + "원");
        }
    }
}
