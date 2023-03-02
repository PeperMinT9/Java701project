package day0302;

public class Ex7Loop {
    public static void main(String[] args) {
        // 5행 5열 출력
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=".repeat(30));
        // 계단
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        System.out.println("=".repeat(30));

        // 계단
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        System.out.println("=".repeat(30));

        // 우측정렬 계단
        String temp = "";
        for(int i = 0; i < 5; i++) {
            temp += "*";
            System.out.printf("%8s\n", temp);
        }
    }
}
