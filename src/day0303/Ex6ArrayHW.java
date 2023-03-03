package day0303;

public class Ex6ArrayHW {
    public static void main(String[] args) {
        int[] data = {100, 29, 14, 43, -123, 45, 250, 245, -192, 294};
        int max = data[0];
        int min = data[0];
        int arr_length = data.length;
        for(int i = 1; i < arr_length; i++) {
            if(data[i] > max) max = data[i];
            if(data[i] < min) min = data[i];
        }
        System.out.printf("최댓값 %5d,  최솟값 %5d", max, min);
    }
}
