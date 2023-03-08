package day0308;

import java.util.Scanner;

abstract class Command {
    public void process() {
        System.out.println("1. 추가합니다  2. 삭제합니다  3. 조회합니다  4. 수정합니다");
    }

    abstract void msg();
}

class Add extends Command {
    @Override
    void msg() {
        System.out.println("추가합니다");
    }

    Add() { msg(); }
}

class Delete extends Command {
    @Override
    void msg() {
        System.out.println("삭제합니다");
    }

    Delete() { msg(); }
}

class Select extends Command {
    @Override
    void msg() {
        System.out.println("조회합니다");
    }

    Select() { msg(); }
}

class Update extends Command {
    @Override
    void msg() {
        System.out.println("수정합니다");
    }

    Update() { msg(); }
}

public class Ex10Interface {
    public static void process(Command comm) {
        comm.process(); // 1. 추가합니다  2. 삭제합니다  3. 조회합니다  4. 수정합니다 출력
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        Command comm = null;

        Exit:
        while(true) {
            System.out.println("1. 추가  2. 삭제  3. 조회  4. 수정  5. 종료");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    comm = new Add();
                    break;
                case 2:
                    comm = new Delete();
                    break;
                case 3:
                    comm = new Select();
                    break;
                case 4:
                    comm = new Update();
                    break;
                default:
                    System.out.println("** 종료합니다 **");
                    break Exit;
            }

            process(comm);
            System.out.println("=".repeat(30));
        }
    }
}
