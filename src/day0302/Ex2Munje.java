package day0302;

import java.util.Scanner;

public class Ex2Munje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sang;
        int su, dan, total;
        System.out.println("상품명입력");
        sang = sc.nextLine();
        System.out.println("수량과 단가를 각가가 입력");
        su = sc.nextInt();
        dan = sc.nextInt();
        total = su * dan;
        System.out.println("총 " + total + "원");
        if(su >= 5) {
            total = (int)(total * 0.9);
            System.out.println("할인된 금액은 " + total + "원 입니다");
        }
    }
}
