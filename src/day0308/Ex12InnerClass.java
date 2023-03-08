package day0308;

// Anonymous 내부 클래스
interface  InterTest {
    public void insert();
    public void delete();
}

abstract class AbstTest {
    abstract public void process();
}

public class Ex12InnerClass {

    // 익명 내부 클래스 형태로 규현한 경우
    InterTest it = new InterTest() {
        @Override
        public void insert() {
            System.out.println("데이터를 추가한다");
        }

        @Override
        public void delete() {
            System.out.println("데이터를 삭제한다");
        }
    };

    AbstTest ab = new AbstTest() {
        @Override
        public void process() {
            System.out.println("process");
        }
    };

    public static void main(String[] args) {
        Ex12InnerClass ex = new Ex12InnerClass();
        ex.it.insert();
        ex.it.delete();

        ex.ab.process();
    }
}
