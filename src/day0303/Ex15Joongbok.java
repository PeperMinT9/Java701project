package day0303;

import java.util.Random;

public class Ex15Joongbok {
    public static void main(String[] args) {
        // 10개의 데이터를 저장할 배열을 생성후 1-30사이의
        // 중복되는 숫자를 배열에 넣어보자
        Random r = new Random();
        int[] data = new int[10];
        int arr_length = data.length;
        for(int i = 0; i < arr_length; i++) {
            data[i] = r.nextInt(30) + 1;
            for(int j = 0; j < i; j++) {
                if(data[i] == data[j]) i--;
            }
        }

        for(int a: data) {
            System.out.printf("%4d", a);
        }
    }
}
