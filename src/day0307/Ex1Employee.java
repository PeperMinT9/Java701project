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

    }
}
