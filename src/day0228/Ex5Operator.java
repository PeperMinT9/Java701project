package day0228;

public class Ex5Operator {
    public static void main(String[] args) {
        int a, b, m, n;
        a = b = 5;
        ++a;
        b++;
        System.out.printf("a=%d,b=%d\n", a, b);

        m = ++a * 3; //먼저a가증가후 3을곱한값을 m으로 대입한다  7*3
        n = b++ * 3; //먼저3을 곱한값을 n에 대입후 b가증가된다  6*3
        System.out.printf("a = %d, b = %d, m = %d, n = %d\n", a, b, m, n);//7,7,21,18

        a = b = 3;
        System.out.println(a++);//출력후 증가 3
        System.out.println(++b);//증가후 출력
    }

}
