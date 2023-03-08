package day0308;

import java.util.List;
import java.util.Vector;

class Super0 {
    public void process() {
        System.out.println("나는 아무 일을 안한다");
    }

    public void superProcess() {
        System.out.println("super 만 가지고 있는 메서드");
    }
}

class Sub0 extends Super0 {
    @Override
    public void process() {
        super.process();
        System.out.println("데이터를 파일에 저장합니다");
    }

    public void sub0Process() {
        System.out.println("sub0 만이 할 수 있는 일");
    }
}

public class Ex3Inheri {
    public static void main(String[] args) {
        // super로 선언하고 sub로 생성시 override 메서드와 super가 가진 메서드는 호출 가능
        // 단 sub만이 가진 메서드는 호출 불가
        Super0 s0 = new Sub0();
        s0.process(); // override 메서드
        s0.superProcess(); // 부모만가진 메서드

        // su0.subProcess(); // 오류 발생
        ((Sub0)s0).sub0Process(); // s0을 Sub0으로 다운 형변환을 하고 호출하는 방법은 가능

        // collection의 List 경우를 보자
        List<String> list = new Vector<>();
        list.add("사과"); // add는 오버라이드 메서드이므로 호출가능

        int n = ((Vector<String>)list).capacity();
        System.out.println("할당크기: " + n);
    }
}
