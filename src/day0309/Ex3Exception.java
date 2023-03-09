package day0309;

public class Ex3Exception {
    public static void exceptTest() {
        System.out.println("여러분 안녕하세요");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("2초뒤 여러분 반가워요");
    }

    public static void exceptTest2() throws InterruptedException {
        System.out.println("하나");
        Thread.sleep(2000);
        System.out.println("2초뒤 둘");
        Thread.sleep(3000);
        System.out.println("3초뒤 셋");
    }
    public static void main(String[] args) {
        exceptTest();

        try {
            exceptTest2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
