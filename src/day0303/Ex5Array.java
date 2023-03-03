package day0303;

public class Ex5Array {
    public static void main(String[] args) {
        // 2차원 배열에 초기값 지정하기
        int[][] arr = {
                {34, 56, 100},
                {67, 42, 100, 66},
                {23, 64, 12, 342}
        };
        System.out.println("행갯수: " + arr.length);
        System.out.println("0번행의 열갯수: " + arr[0].length);
        System.out.println("1번행의 열갯수: " + arr[1].length);
        System.out.println("2번행의 열갯수: " + arr[2].length);

        System.out.println("** 출력 1 **");
        int out_length = arr.length;
        int in_length;
        for(int i = 0; i < out_length; i++) {
            in_length = arr[i].length;
            for(int j = 0; j < in_length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("** 출력 2 **");
        for(int[] a: arr) {
            for(int b: a) {
                System.out.printf("%5d", b);
            }
            System.out.println();
        }
    }
}
