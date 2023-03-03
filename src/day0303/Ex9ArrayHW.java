package day0303;

import java.util.Scanner;

public class Ex9ArrayHW {
    public static void main(String[] args) {
        String[] members = {"이효리", "강호동", "손미니", "손흥민", "강모씨",
                "이진", "박재범", "이효순", "박재순", "손예진", "김순자", "김말자",
                "이진상", "박진상", "손진상", "마이클", "재니퍼", "재니슨", "마이클", "이순자"};
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        // 성이나 이름이 앞글자를 입력시 그 단어로 시작하는 이름들을 출력하고 그 인원수를 파악
        int arr_length = members.length;
        for(int i = 0; i < arr_length; i++) {
            if(members[i].startsWith(name)) {
                System.out.printf("%d: %4s를 찾았습니다.\n", i, members[i]);
            }
        }
    }
}
