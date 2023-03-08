package day0308;

class Parent {
    public void play() {
        System.out.println("나는 부모 일을 시킨다");
    }
}

class  Child0 extends Parent {
    @Override
    public void play() {
        super.play();
        System.out.println("첫째: 청소 담당");
    }
}

class Child1 extends Parent {
    @Override
    public void play() {
        super.play();
        System.out.println("둘째: 밥 담당");
    }
}

class Child2 extends Parent {
    @Override
    public void play() {
        super.play();
        System.out.println("셋째: 설거지 담당");
    }
}

public class Ex2Inheri {
    public static void process(Parent p) {
        p.play(); // 다형성 처리
    }
    public static void main(String[] args) {
//        Parent p = null;
//
//        p = new Child0();
//        p.play();
//
//        p = new Child1();
//        p.play();
//
//        p = new Child2();
//        p.play();
        process(new Child0());
        process(new Child1());
        process(new Child2());
    }
}
