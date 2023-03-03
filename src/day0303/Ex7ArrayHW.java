package day0303;

import java.util.Scanner;

public class Ex7ArrayHW {
    public static void main(String[] args) {
        int[] data = {12, 5, 8, 11, 9, 15, 3, 17, 1, 10};
        Scanner sc = new Scanner(System.in);
        // 숫자 입력 후 그 숫자가 배열 몇번째에 있는지 출력하기
        int arr_length = data.length;
        System.out.println("찾으시는 값을 입력해주세요");
        int num = sc.nextInt();
        int idx = -1;
        // 첫번째 방법
//        for(int i = 0; i < arr_length; i++) {
//            if(data[i] == num) {
//                System.out.printf("찾으시는 값 %4d의 인덱스는 %2d입니다\n", num, i);
//                idx = i;
//                break;
//            }
//            if(i == arr_length - 1) {
//                System.out.println("찾으시는 값이 없습니다");
//            }
//        }
//        if(idx != -1) {
//            System.out.printf("찾으시는 값 %4d의 인덱스는 %2d입니다\n", num, idx);
//        }
//        else {
//            System.out.println("찾으시는 값이 없습니다");
//        }
        // 두번째 방법
        boolean n = false;
        int counter = 0;
        while(!n) {
            if(data[counter] == num) {
                System.out.printf("찾으시는 값 %4d의 인덱스는 %2d입니다\n", num, counter);
                idx = counter;
                n = true;
            }
            if(counter == arr_length - 1 && n == false) {
                System.out.println("찾으시는 값이 없습니다");
                break;
            }
            counter++;
        }
    }
}
