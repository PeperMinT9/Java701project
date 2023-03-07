package day0307;

import java.util.Scanner;

class Employee {
    static final String EMPNAME = "~삼성전자~";
    private String name;
    private String addr;
    private int gibon;
    private int sudang;

    public void setName(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setGibon(int gibon) {
        this.gibon = gibon;
    }
    public void setSudang(int sudang) {
        this.sudang = sudang;
    }

    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
    public int getGibon() {
        return gibon;
    }
    public int getSudang() {
        return sudang;
    }

    public double getTax(int gibon){
        return gibon * 0.03;
    }
    public double getNetPay(double tax, int gibon, int sudang) {
        return gibon + sudang - tax;
    }
    public void writeSawon(int idx) {
        System.out.printf("%-3d%-4s%-4s%10d%10d%10.2f%10.2f", idx,
                getName(), getAddr(), getGibon(), getSudang(),
                getTax(this.gibon), getNetPay(this.getTax(this.gibon), this.gibon, this.sudang));
    }
}

public class Ex1Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("처음 입력할 갯수부터 입력후 배열할당하세요");
        int num = Integer.parseInt(sc.nextLine());
        day0307.Employee[] ep = new day0307.Employee[num];
        for(int i = 0; i < num; i++) {
            ep[i] = new day0307.Employee();
            System.out.printf("사원명: ");
            ep[i].setName(sc.nextLine());
            System.out.printf("주소: ");
            ep[i].setAddr(sc.nextLine());
            System.out.printf("기본급: ");
            ep[i].setGibon(Integer.parseInt(sc.nextLine()));
            System.out.printf("수당: ");
            ep[i].setSudang(Integer.parseInt(sc.nextLine()));
        }
        System.out.println(day0307.Employee.EMPNAME + " 직원 현황");
        System.out.printf("%-3s%-4s%-4s%8s%8s%8s%8s\n", "번호", "사원명", "주소",
                "기본급", "수당", "세금", "실수령액");
        System.out.println("=".repeat(50));
        for(int i = 0; i < num; i++) {
            ep[i].writeSawon(i + 1);
            System.out.println();
        }

    }
}
