package day0307;

class SuperObj { // 부모 클래스(super class)
    String msg;
    SuperObj() {
        System.out.println("super 클래스의 생성자");
    }

    SuperObj(String msg) {
        this.msg = msg;
    }
}

class SubObj extends SuperObj { // 자식 클래스(sub class): 자바는 단일상속만 지원
    String msg2;
    SubObj() {
        super(); // 생량되어있음, 무조건 첫줄에 있어야만 한다.
        System.out.println("sub 클래스의 생성자");
    }

    SubObj(String msg, String msg2) {
        super(msg); // 인자가 같은 타입인 super클래스의 생성자가 호출된다, 생략안됨
        this.msg2 = msg2;
    }

    public void writeData() {
        System.out.println(msg);
        System.out.println(msg2);
    }
}
public class Ex13Inheri {
    public static void main(String[] args) {
        SubObj sub = new SubObj();

        SubObj sub2 = new SubObj("아버지", "저예요");
        sub2.writeData();
    }
}
