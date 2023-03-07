package day0306;

class Apple {
    public String mes0 = "Hello";
    private String mes1 = "Happy";
    public static final String MES = "Have a Good Day!";

    public String getMes1() {
        return mes1;
    }

    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }
}

public class Ex4Object {
    public static void main(String[] args) {
        // Apple이 가진 멤버변수중 new로 생성하지 않아도 접근이 가능한 변수는 누구일까
        System.out.println(Apple.MES);

        // 인스턴스 멤버변수는 new로 생성후 접근이 가능하다
        Apple a= new Apple();
        System.out.println(a.mes0);

        // mes1 출력
        System.out.println(a.getMes1());

        // mes1 값을 Bitcamp로 수정
        a.setMes1("Bitcamp");

        // 변경된 값을 다시 출력
        System.out.println(a.getMes1());
    }
}
