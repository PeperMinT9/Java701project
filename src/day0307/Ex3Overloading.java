package day0307;

class Orange {
    public static double add(int a, int b) {
        double c = a + b;
        return c;
    }
    public static double add(double a, double b) {
        double c = a + b;
        return c;
    }
    public static double add(float a, float b) {
        double c = a + b;
        return c;
    }
    public static String add(String a, String b) {
        String c = a + b;
        return c;
    }
}

public class Ex3Overloading {
    public static void main(String[] args) {
        System.out.println("5 + 6 = " + Orange.add(5, 6));
        System.out.println("3.2 + 2.5 = " + Orange.add(3.2, 2.5));
        System.out.println("2.4f + 1.2f = " + Orange.add(2.4f, 1.2f));
        System.out.println("Apple + Orange = " + Orange.add("Apple", "Orange"));
    }
}
