package day0303;

public class Ex4Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 5;
        arr[1][1] = 10;
        arr[1][2] = 15;

        System.out.println("행갯수: " + arr.length);
        System.out.println("0번 행의 열갯수: " + arr[0].length);

        System.out.println("2차원 데이터 출력");
        int arr_length = arr.length;
        int arrin_length = arr[0].length;
        for(int i = 0; i < arr_length; i++) {
            for(int j = 0; j < arrin_length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
