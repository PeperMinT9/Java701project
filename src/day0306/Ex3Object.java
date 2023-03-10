package day0306;

/*
* 멤버변수 선언시 static을 붙이면 class 멤버변수라 한다
* 크래스명.static멤버 번슈 이렇게 호출이 가능하기 때문
* static 멤버변수는 같은 객체 생성시 공유되는 값
*
* static 메서드의 특징: this가 존재하지 않는다
* 그러므로 일반 멤버변수나 메서드는 호출 불가능
* (단, new로 생성시 가능)
* static 멤버변수나 멤버메서드는 인스턴스가 없어어도 호출가능하므로 이경우는
* 호출이 가능하다
*/
public class Ex3Object {
    String name;
    int score;

    // static(클래스) 멤버변수 선언
    static String message = "월요일!";
    public static void main(String[] args) {
        // System.out.println(score); // 오류있음

        // static 메서드에는 this라는 인스턴스 변수가 존재하지 않음
        // 그래서 부득이 접근하고 싶을 경우 new로 생성후 접근
        Ex3Object ex3 = new Ex3Object();
        ex3.name = "홍길동";
        ex3.score = 90;

        System.out.println("이름: " + ex3.name);
        System.out.println("점수: " + ex3.score);

        System.out.println(message); // static변수는 호출가능
        System.out.println(Ex3Object.message); // 원래는 앞에 클래스명이 붙는데 자기 자신일 경우는 생량 가능
    }
}
