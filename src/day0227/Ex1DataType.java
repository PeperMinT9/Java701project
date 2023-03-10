package day0227;

public class Ex1DataType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("자바 프로젝트 생성!!");
        // 정수 타입 byte(1)-short(2)-int(2)-long(8)
        byte a = 127;
        byte b = (byte)310; // 강제로 자료형보다 큰값을 넣을경우 값손실이 발생한다
        System.out.println(a);
        System.out.println(b); // 틀린값이 나온다
        char m1 = 'A';
        char m2 = '가'; // 자바에서는 char는 2바이트라 한글도 한글자 가능
        System.out.println(m1 + " , " + m2);
        // ascii code:  A: 65  B: 97
        System.out.println((int)m1);

        // 묵시적 형변환: 연산시 자동으로 결정되는 타입(int + int = int, double + int = double)
        // String + int = String, char + int = int
        System.out.println(m1 + 32); // 'A' + 32 = 97: char와 int의 결과는 int
        System.out.println((char)(m1 + 32)); // a

        char m3 = 66; // 내부적으로는 문자 'B'로 인식
        int m4 = 'A'; // 내부적으로는 65로 인식
        System.out.println(m3 + ", " + m4); // B, 65
        System.out.println((int)m3 + ", " + (char)m4); // 66, A
    }
}
