package day0309;

import java.util.Scanner;

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

public class Ex8UserException {
    public static void inputName() throws UserException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // asdf 또는 qwer 입력시 강제 예외 발생
        if(name.equals("asdf") || name.equals("qwer"))
            throw new UserException("잘못된 이름입니다");
        else System.out.println("내 이름은 " + name);
    }
    public static void main(String[] args) {
        try {
            inputName();
        }
        catch (UserException e) {
            System.out.println("이름 오류: " + e.getMessage());
        }
    }
}
