package day0308;

/*
* 인터페이스는 음식점의 메뉴, 또는 작업일지 같은 역할을 한다.
* 실체는 없고 할일을 나열만 해놓은 것이다.
*
* 상수와 추상메서드로만 구성되어있다.
*/

interface InterA {
    public void draw();
    public void play();
    public void study();
}

class My implements InterA {
    @Override
    public void draw() {
        System.out.println("그림을 그린다");
    }

    @Override
    public void play() {
        System.out.println("피아노를 친다");
    }

    @Override
    public void study() {
        System.out.println("자바공부를 한다");
    }
}

public class Ex6Interface {
    public static void main(String[] args) {
        InterA a = new My();
        a.draw();
        a.study();
        a.play();
    }
}
