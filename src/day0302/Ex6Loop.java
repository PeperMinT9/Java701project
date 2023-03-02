package day0302;

public class Ex6Loop {
    public static void main(String[] args) {
        // 1. 1-20까지의 숫자중 3의 배수만 출력 printf("%4d", 변수)
        int a = 5;
        int idx = 0;
        while(a < 20) {
            idx++;
            a = 5 * idx;
            System.out.printf("%2d", a);
        }
        System.out.println();

        // 2. 10-1까지 거꾸로 출력
        for(int i = 10; i > 0; i--) {
            System.out.printf("%d", i);
        }
        System.out.println();

        // 3. 1-30까지 숫자중 5의 배수만 출력
        a = 1;
        while(a < 31) {
            a++;
            if(a % 5 == 0) {
                System.out.printf("%2d", a);
            }

        }
        System.out.println();

        // 4. * 20개 출력
        for(int i = 0; i < 20; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 5. 1~20까지중 홀수만 출력
        for(int i = 0; i < 21; i += 2) {
            System.out.printf("%4d", i);
        }
    }
}
