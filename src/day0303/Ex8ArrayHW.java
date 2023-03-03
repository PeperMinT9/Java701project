package day0303;

import java.util.Scanner;

public class Ex8ArrayHW {
    public static void main(String[] args) {
        String[] members = {"이효리", "강호동", "손미니", "손흥민", "강모씨",
            "이진", "박재범", "이효순", "박재순", "손예진", "김순자", "김말자",
            "이진상", "박진상", "손진상", "마이클", "재니퍼", "재니슨", "마이클", "이순자"};
        System.out.println(members.length);

        // 검색할 이름을 입력후 몇번째에 있는지 출력
        // 없을경우 없다는 메세지 출력

        Scanner sc = new Scanner(System.in);
        int idx = 0;
        System.out.println("찾을값을 입력해주세요");
        String str = sc.nextLine();
        int arr_length = members.length;
        for(String s: members) {
            // if(str.equals(s)) {
            if(str.compareTo(s) == 0) { // 0이면 같다는 뜻
                System.out.printf("%4s를 찾았습니다. 위치는 %d입니다", str, idx);
                break;
            }
            idx++;
            if(idx == arr_length - 1) {
                System.out.printf("%4s가 없습니다.", str);
            }
        }
    }
}
