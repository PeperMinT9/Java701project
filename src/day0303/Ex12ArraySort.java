package day0303;

public class Ex12ArraySort {
    public static void main(String[] args) {
        int[] data = {3, 5, 4, 1, 2};
        int temp;

        // selection sort

        int arr_length = data.length;
        for(int i = 0; i < arr_length; i++) {
            for(int j = i + 1; j < arr_length; j++) {
                if(data[i] > data[j]) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        for(int d: data) {
            System.out.println(d);
        }
    }
}
