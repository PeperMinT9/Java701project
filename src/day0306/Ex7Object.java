package day0306;

import java.util.Scanner;

class MyCar {
    static final String EMP = "현대자동차";
    private String carName;
    private String carColor;
    private int carPrice;

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
    public String getCarName() {
        return this.carName;
    }
    public String getCarColor() {
        return this.carColor;
    }
    public int getCarPrice() {
        return this.carPrice;
    }
    public void writeCar() {
        System.out.println(this.getCarName() + "\t" + this.getCarColor() + "\t" + this.getCarPrice());
    }
}
public class Ex7Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt, price;
        String carName, color;
        MyCar[] cars;

        // 입력할 갯수
        System.out.println("입력할 자동차 갯수는?");
        cnt = Integer.parseInt(sc.nextLine());

        // 갯수만큼 할당
        cars = new MyCar[cnt];

        // 갯수만큼 자동차에 대한 데이타 넣기
        for(int i = 0; i < cnt; i++) {
            cars[i] = new MyCar();
            System.out.println("자동차명?");
            carName = sc.nextLine();
            cars[i].setCarName(carName);

            System.out.println("자동차 색상은?");
            color = sc.nextLine();
            cars[i].setCarColor(color);

            System.out.println("자동차 가격은?");
            price = Integer.parseInt(sc.nextLine());
            cars[i].setCarPrice(price);
        }

        // 출력
        System.out.println("자동차 회사명: " + MyCar.EMP);
        System.out.println();
//        System.out.println("자동차명\t차색상\t차단가");
        System.out.printf("%8s%7s%8s\n", "자동차명", "차색상", "차단가");
        System.out.println("=".repeat(20));
        for(MyCar my: cars) {
            my.writeCar();
        }
    }
}
