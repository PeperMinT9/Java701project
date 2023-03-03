package day0303;

public class Ex1Array {
    public static void main(String[] args) {
        char[] ch; // 배열 선언만 한것, 메모리 할당이 안되어 있어서 이상태로는 데이터 저장 불가
        ch = new char[4];
        int a = ch.length;
        System.out.println(a);
        // 할당된 배열에 데이터 넣기
        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';
        ch[3] = 'D';
        System.out.println(ch[3]);

        for(int i = 0; i < a; i++) {
            System.out.println(ch[i] + " : " + (int)ch[i]);
        }
        System.out.println("=".repeat(20));
        for(char b : ch) {
            System.out.println(b + " : " + (int)b);
        }
    }
}
