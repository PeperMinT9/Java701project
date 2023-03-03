package day0303;

public class Ex13ArraySortString {
    public static void main(String[] args) {
        String[] names= {"홍길동", "강호동", "James", "남순희", "신지아"};
        // 오름차순으로 정렬해서 출력하기(문자열 compareTo로 비교)
        String temp = "";
        int arr_length = names.length;
        for(int i = 0; i < arr_length; i++) {
            for(int j = i + 1; j < arr_length; j++) {
                if(names[i].compareTo(names[j]) > 0) {
                    temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
        }

        for(String str: names) {
            System.out.println(str);
        }
    }
}
