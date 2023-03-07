package day0307;

class Test0 {
    private String name;
    private int age;

    Test0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "test [name= " + name + ", age= " + age + "]";
    }
}
public class Ex15ToString {
    public static void main(String[] args) {
        Test0 t0 = new Test0("이미자", 20);
        System.out.println(t0.toString());
        System.out.println(t0); // toString 메서드는 클래스 변수명만 써줘도 자동 호출된다
    }
}
