package day0302;

public class Ex11Loop {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                if(j == 3) continue;
                System.out.printf("i = %d, j = %d", i, j);
            }
            System.out.println();
        }
        System.out.println();
        Loop1:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                if(j == 3) continue Loop1;
                System.out.printf("i = %d, j = %d", i, j);
            }
            System.out.println();
        }
        System.out.println();
        Loop2:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {

                System.out.printf("i = %d, j = %d  ", i, j);
                if(j == 3) break Loop2;
            }
            System.out.println();
        }
        System.out.println();
    }
}
