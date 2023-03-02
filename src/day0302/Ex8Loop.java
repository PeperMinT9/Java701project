package day0302;

public class Ex8Loop {
    public static void main(String[] args) {
        // 우측정렬 계단
        String s = "";
        for(int i = 0; i < 5; i++) {
            s += "*";
            System.out.printf("%8s\n", s);
        }
        // 1 3 5 7 9
        int temp = 9;
        for(int i = 0; i < 5; i++, temp -= 2) {
            for(int j = 0; j < temp / 2; j++) {
                System.out.printf(" ");
            }
            for(int j = 0; j < 1 + i * 2; j++) {
                System.out.printf("*");
            }
            for(int j = 0; j < temp / 2; j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
        System.out.println("=".repeat(30));

    }
}
