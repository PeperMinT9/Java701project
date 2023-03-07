package day0307;

class Apple {
    public static int getLength(int n) {
        String s = String.valueOf(n);

        return s.length();
    }
    public static int getLength(double n) {
        String s = String.valueOf(n);

        return s.length();
    }
    public static int getLength(float n) {
        String s = String.valueOf(n);

        return s.length();
    }
    public static int getLength(String n) {
        return n.length();
    }
}

public class Ex2Overloading {
    public static void main(String[] args) {
        int n0 = 123000;
        float n1 = 123.456f;
        double n2 = 32.5223;
        String n3 = "Yes Or No";

        System.out.println("각 데이터의 길이 구하기");
        System.out.println(n0 + "의 길이는 " + Apple.getLength(n0));
        System.out.println(n1 + "의 길이는 " + Apple.getLength(n1));
        System.out.println(n2 + "의 길이는 " + Apple.getLength(n2));
        System.out.println(n3 + "의 길이는 " + Apple.getLength(n3));

    }
}
