package day0303;

import java.util.Scanner;

public class Ex10ArrayHW {
    public static void main(String[] args) {
        String[] members = {"이효리", "강호동", "손미니", "손흥민", "강모씨",
                "이진", "박재범", "이효순", "박재순", "손예진", "김순자", "김말자",
                "이진상", "박진상", "손진상", "마이클", "재니퍼", "재니슨", "마이클", "이순자"};
        Scanner sc = new Scanner(System.in);

        String name;
        int menu, count;
        // 메뉴
        // 1. 시작하는 이름으로 찾기
        // 2. 끝나는 이름으로 찾기
        // 3. 종료
        Exit:
        while(true) {
            count = 0;
            System.out.println("** 메뉴 선택 **");
            System.out.println("1. 시작하는 이름으로 찾기");
            System.out.println("2. 끝나는 이름으로 찾기");
            System.out.println("3. 종료");
            System.out.println("=".repeat(20));
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    name = sc.nextLine();
                    for(String str: members) {
                        if(str.startsWith(name)) {
                            System.out.printf("%d. %4s를 찾았습니다\n", count, name);
                        }
                        count++;
                    }
                    break;
                case 2:
                    name = sc.nextLine();
                    for(String str: members) {
                        if(str.endsWith(name)) {
                            System.out.printf("%d. %4s를 찾았습니다\n", count, str);
                        }
                        count++;
                    }
                    break;
                default:
                    System.out.println("** 프로그램 종료 **");
                    break Exit;
            }
        }
    }
}
