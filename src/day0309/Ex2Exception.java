package day0309;

import java.util.Scanner;

class ExceptTest2 {
    // throws: 메서드를 호출하는 곳으로 2개의 예외를 던짐
    public static void inputData() throws NumberFormatException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int su1, su2;

        System.out.println("두개의 숫자를 입력하세요");
        su1 = Integer.parseInt(sc.next());
        su2 = Integer.parseInt(sc.next());

        System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);
        System.out.printf("%d / %d = %3.1f\n", su1, su2, (double)su1 / su2);
    }
}

public class Ex2Exception {
    public static void main(String[] args) {
//        try {
//            ExceptTest2.inputData();
//        }
//        catch (ArithmeticException e) {
//            System.out.println("2번째 숫자가 0임: " + e.getMessage());
//        }
//        catch (NumberFormatException e) {
//            System.out.println("문자가 입력됨: " + e.getMessage());
//        }

        // 두 개의 Exception을 묶어서 처리하고 묶어서 처리하고 싶을때
        try {
            ExceptTest2.inputData();
        }
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println("문자가 들어갔거나 2번째 숫자가 0일 경우: " + e.getMessage());
        }
        finally {
            System.out.println("여기는 무조건 실행되는 영역입니다");
        }
        System.out.println("** 정상종료 **");
    }
}
