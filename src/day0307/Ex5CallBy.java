package day0307;

class Test {
    String name = "아무개";
    int age = 32;
}

class CallBy {


    // call by value: 주소가 아닌 값만 전달된다(모든 기본형, String이 해당)
    public void changeInt(int n) { // 메인의 n하고는 완전다른 변수(값만 전달받음)
        n += 10;
        System.out.println("changeInt n = " + n);
    }

    public void changeString(String m) {
        m = "hello";
    }

    // 배열은 call by reference이다
    public void changeArray(int[] a) {
        a[1] = 100; // 2번째 값만 바꿔보자
    }

    public void changeTest(Test t) { // 메인의 t변수와 주소가 같은 변수이다
        t.name = "이상아";
        t.age = 35;
    }
}
public class Ex5CallBy {
    public static void main(String[] args) {
        CallBy call = new CallBy();
        int n = 100;
        call.changeInt(n); // n은 값으로 전달
        System.out.println("n을 바꼈을까요? " + n);

        String m = "happy";
        call.changeString(m);
        System.out.println("m은 바꼈을까요? " + m);

        int[] arr0 = {10, 20, 30}; // 배열은 타입상관없이 객체이다
        call.changeArray(arr0); // 배열 a의 주소가 전달, 메서드의 인자와 메인의 배열변수는 주소가 같은 변수이다.
        System.out.println("배열 값은 변경되었을까요?");
        for(int b: arr0) {
            System.out.print(b + "  "); // 1번 배열값이 바껴있다.
        }
        System.out.println();

        Test t = new Test();
        System.out.println(t.name + ", " + t.age);
        call.changeTest(t);
    }
}
