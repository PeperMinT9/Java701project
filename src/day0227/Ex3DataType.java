package day0227;

public class Ex3DataType {

    public static void main(String[] args) {
        // 실수형 자료형(float 4bit, double 8bit)
        float f1 = 1.2f; // 숫자 뒤에 f를 써야 4바이트 flat 타입으로 인식
        double f2 = 1.5;
        System.out.println(f1);
        System.out.println(f2);

        float f3 = 1234.12453453f;
        double f4 = 1234.4564575685;
        System.out.println(f3); // 소수점 포함 8자리만 정확하게 나옴
        System.out.println(f4); // 소숫점 포함 모두 다 나옴

        boolean b1 = true;
        boolean b2 = f1 == f2; // f1과 f2가 같으면 true, 다르면 false
        System.out.println(b1); // true
        System.out.println(b2); // false
    }
}
