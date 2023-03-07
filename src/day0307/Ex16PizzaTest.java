package day0307;

class Pizza {
    int size;
    String type;

    public Pizza() {
        this.size = 12;
        this.type = "슈퍼슈프림";
    }

    public Pizza(int s, String t) {
        size = s;
        type = t;
    }
}

public class Ex16PizzaTest {
    public static void main(String[] args) {
        Pizza piz0 = new Pizza();
        System.out.println("피자 종류: " + piz0.type + " 사이즈: " + piz0.size);

        Pizza piz1 = new Pizza(30, "콤비네이션");
        System.out.println("피자 종류: " + piz1.type + " 사이즈: " + piz1.size);
    }
}
