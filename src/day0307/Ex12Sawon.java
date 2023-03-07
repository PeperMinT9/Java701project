package day0307;

import day0307_2.Sawon;

import java.util.Scanner;

public class Ex12Sawon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt;
        Sawon[] sa;
        System.out.println("입력할 사원수는?");
        cnt = Integer.parseInt(sc.nextLine());

        sa = new Sawon[cnt];
        for(int i = 0; i < cnt; i++) {
            System.out.println(i + "번지 사원정보 입력");
            System.out.println("사원명");
            String name = sc.nextLine();
            System.out.println("혈액형");
            String blood = sc.nextLine().toUpperCase();
            System.out.println("부서명");
            String buseo = sc.nextLine();
            System.out.println("1. 여자 2. 남자");
            int n = Integer.parseInt(sc.nextLine());
            String gender = n == 1? "여자" : "남자";

            sa[i] = new Sawon(name, blood, buseo, gender);
            System.out.println();
        }

        System.out.println("\t\t사원 정보");
        System.out.println("번호\t사원명\t부서\t혈액형\t성별");
        System.out.println("=".repeat(60));
        for(int i = 0; i < cnt; i++) {
            System.out.println((i + 1) + "\t" + sa[i].getName() + "\t" +
                    sa[i].getBuseo() + "\t" +
                    sa[i].getBlood() + "형\t" + sa[i].getGender());
        }
    }
}
