package day0308_2;

interface Employable {
    String getName();

    static boolean isEmpty(String str) {
        if(str == null || str.trim().length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Employee implements Employable {
    private String name;

    public Employee(String name) {
        if(Employable.isEmpty(name) == true)
            throw new RuntimeException("이름을 반드시 입력해야 함");
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

public class Ex17StaticTest {
    public static void main(String[] args) {
        Employable ee0 = new Employee("asdf");
        Employable ee1 = new Employee(".");

        System.out.println(ee0.getName());
        System.out.println(ee1.getName());
    }
}
