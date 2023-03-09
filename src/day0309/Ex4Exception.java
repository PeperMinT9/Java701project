package day0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4Exception {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;
        BufferedReader br = null;

        String name = "";
        String addr = "";
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

        System.out.print("이름 입력: ");
        name = br.readLine();

        System.out.print("주소 입력: ");
        addr = br.readLine();

        System.out.println(name + "의 이름은 " + addr + "입니다");
    }
}
