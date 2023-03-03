package day0303;

public class Ex3Array {
    public static void main(String[] args) {
        int[] arr0 = {34, 56, 78, 100, 39};
        double[] arr1 = {1.2, 3.4, 5.6, 7.8, 12.89, 10.9};
        System.out.println(arr0.length);
        System.out.println(arr1.length);

        int l0 = arr0.length, l1 = arr1.length;

        for(int i = 0; i < l0; i++) {
            System.out.printf("%5d", arr0[i]);
        }
        System.out.println();
        for(int a : arr0) {
            System.out.printf("%5d", a);
        }
        System.out.println();
        System.out.println("=".repeat(20));

        for(int i = 0; i < l1; i++) {
            System.out.printf("%5.1f", arr1[i]);
        }
        System.out.println();
        for(double a : arr1) {
            System.out.printf("%5.1f", a);
        }
        System.out.println();
        System.out.println("=".repeat(20));
    }
}
